# blancoValueObjectのビルドとRelease運用

## Java要件とバージョン

ビルドにはJDK 17、Maven 3.6.3以上、Antを使う場合は1.10.18を使用します。本体はMaven・AntともにJava 8のAPI・bytecode（class major 52）を対象にします。依存ライブラリ全体のJava 8 JVM上での実行を、このclass形式の検証だけで保証するものではありません。

本体バージョンはPOMを正とし、AntもPOMから読み取ります。今回の版は`blanco.valueobject:blanco-valueobject:2.2.0`です。`2.1.0`は既存Mavenリポジトリに公開済みだったため、未使用の`2.2.0`へ変更しました。生成時のbootstrap artifact `blanco-valueobject:2.1.6`は本体版と別の依存です。生成メタデータに残る歴史的な版は、生成後の共通`stamp-version` targetでPOM版へ揃えます。Maven・Antともにこの処理を実行し、`BlancoValueObjectConstants.VERSION`と配布JARの表示も本体版に一致させます。

## BeanUtils修正版と依存の前提

Listの要素コピーには`blanco.beanutils:blanco-beanutils:1.1.2`を使用します。blancoCgが返すgeneric表記に角括弧がない場合も認識する修正版です。レビュー済みソースを公開し、POMとJARを`igapyon/blancofw-maven2`の`gh-pages`へ公開してから、通常CI・Releaseへ進みます。

- 修正版：`https://raw.githubusercontent.com/igapyon/blancofw-maven2/gh-pages/`
- 既存Blanco依存：`https://raw.githubusercontent.com/uedaueo/blancofw-maven2/gh-pages-poi5/`
- Maven Central：`https://repo.maven.apache.org/maven2/`

`blanco.beanutils.repository.url`は検証用の代替リポジトリURLを受け取ります。公開前の仮配布による成功と、公開後の外部取得による成功は分けて記録します。ローカルinstall済みartifactだけでの成功は公開確認になりません。

本体がJava生成に使う`blanco.cg:blanco-cg:2.3.13`は、別座標の`jp.igapyon.blanco.cg:blanco-cg`へ機械的に置き換えません。AntTask・BatchProcess・Constants・Message・Meta2Xml・ResourceBundle・旧ValueObjectは自己生成用のoptional依存で、利用側へ推移的に配布しません。

## 生成ソースのGit管理

`blanco/main/`の生成Javaとpropertiesは`.gitignore`で除外し、追跡済みの生成ファイルもGit管理から外します。管理する入力は`meta/program/`の定義書と生成処理です。生成コードへの修正は元の定義書または生成処理へ反映し、生成結果を強制追加しません。POM版への定数の整合は既存の`stamp-version`で行います。

```sh
git ls-files -- blanco/main
```

このコマンドの出力がないことを確認します。既存追跡ファイルのignore判定には`git check-ignore --no-index`を使用します。追跡を解除する際は、定義書から再現できる対象パスを確認し、ローカル実体を保持する`git rm --cached`を使います。

生成物を含まない新規チェックアウト相当でMaven・Antの生成とテストを確認し、通常JARに必要なclass・XML・properties、sources JARに通常ソース・生成済みソースが含まれることを確認します。BeanUtils修正版の外部公開の前提は、この追跡解除とは別に確認します。

## Maven・Antのビルドと検証

```sh
mvn --batch-mode --no-transfer-progress clean verify
```

`clean`で生成物を削除し、メタデータから再生成します。`generate-test-sources`は既存PHPサンプルの生成を含みます。SurefireのJavaテストとFailsafeの最終JAR検証を`verify`まで実行してください。

- `CopyToTest`：classのdescription/annotation/import/implementsとfieldのdescription/annotationのList要素・独立性、null処理。
- `GenerationTest`：`meta/objects`のJava様式3定義書（Sample、Sample2、Sample3 Structure）からJavaを生成し、Java 8向けにコンパイル。
- `JarSmokeIT`：package後の通常JARを隔離classloaderで読み、XML/propertiesと本体classの取得先を確認。同じ定義書からの生成・コンパイル、全本体classのmajor 52と本体定数の版、sources JAR内の通常・生成ソースも確認。

通常JARは依存を含まないライブラリJARです。`src/main/resources`の定義書構造XMLと`blanco/main`のpropertiesを含みます。sources JARは`jar-no-fork`で生成し、生成処理を重複実行しません。

```sh
ant build
```

AntはPOMのruntime依存を`target/lib/`へ解決し、自己生成・コンパイルを実行します。成果物は`lib.ant/blancovalueobject-2.2.0.jar`と`blancoValueObject-2.2.0-src.zip`です。別のキャッシュを使う場合は`ant -Dmaven.repo.local=/absolute/path build`を指定できます。仮配布先を使う検証では`-Dblanco.beanutils.repository.url=<URL>`も渡せます。GitHub ReleaseにはMaven版JARを使用します。

旧`blancovalueobject-2.0.3.jar`を参照する現行Maven・Ant・Eclipseのビルド経路はありません。Git追跡を解除し、ローカルに残す場合もignore対象にします。Releaseへの添付には使用しません。`task.xml`と`meta.xml`は古い補助テンプレートであり、今回のビルド入口は`pom.xml`と`build.xml`です。

## CIとタグ起点のRelease

`.github/workflows/build.yml`は`master`へのpush・PR、手動実行でTemurin JDK 17の`clean verify`を実行します。権限は`contents: read`です。

`.github/workflows/release.yml`は`v*`タグのpushでタグのソースを取得し、タグの`v`以降とPOMのproject versionを完全一致で確認してから`clean verify`を実行します。権限は`contents: write`です。成功後、そのタグのGitHub Releaseへ次の2ファイルを添付します。

- `blanco-valueobject-2.2.0.jar`
- `blanco-valueobject-sources-2.2.0.jar`

対応するタグは`v2.2.0`です。同名のRelease添付ファイルは置き換えます。公開直後に2ファイルを再ダウンロードし、ステージ時のSHA-256と一致することを確認して、ダウンロードしたJARに対する3件の統合テストを再実行します。チェックサムはrunnerの一時領域に保存するため、Release添付は2JARだけです。通常CI・Releaseともに`deploy`を実行しません。POMにGPG署名executionはなく、この整備で一律の署名設定は追加していません。従来の`mvn deploy`は`uedaueo`向けGitHub Pages設定を使う別の公開操作です。

公開手順は次のとおりです。

1. BeanUtils修正版のソースとMaven配布物をレビュー・公開し、空キャッシュから通常設定の`clean verify`を確認する。
2. 既存の先行2コミット、定義書・生成処理の修正、生成ソースとworkplaceの追跡解除、今回の差分をレビューし、commit・push・PR mergeを行う。
3. POMと一致する`v2.2.0`を対象merge commitに付け、pushする。
4. CIとRelease workflow、タグ・POM・merge commitの一致、2添付JARを確認する。
5. 公開JARをダウンロードし、SHA-256、リソース、生成動作を再確認し、対象Dependabotアラートの再評価結果を記録する。

## ローカル作業領域

`blanco/main/`、`workplace/`、`target/`、`lib.ant/`、`release-assets/`、Ant生成JARとソースZIPはローカル作業・成果物用です。Gitに登録しません。追跡解除は`git ls-files -- blanco/main workplace`で確認します。AntソースZIPにもworkplaceなどの作業領域を含めません。

## 2026-10-27のローカル検証結果

BeanUtilsの2テスト、ValueObjectのSurefire 5テストとFailsafe 3テストがすべて成功しました。修正前のBeanUtilsを使った対照実行では、角括弧なしgenericのテストがList空配列への退行を検出して失敗し、角括弧付きの既存形式は成功しました。

生成物とMavenキャッシュのない状態から、公開候補BeanUtilsをローカルHTTPリポジトリへ仮配布して`clean verify`が成功しました。BeanUtilsをlocal installせず、POM・JARをHTTPで取得しています。外部の公開URLはまだ404であり、公開後の空キャッシュ検証は残っています。

Mavenの通常JARは15classすべてがmajor 52で、XMLと2つのpropertiesを含みます。最終JARだけから本体class・リソースをロードし、Java定義書3件の生成・コンパイルが成功しました。Ant 1.10.18でも生成物なしの別コピーから`build`が成功し、同じ版のJARとソースZIPを生成しました。workflowの`actionlint`も成功しています。

依存ツリーではPOI一式5.5.1とXMLBeans 5.3.0、AntRunの実効依存ではCommons Net 3.13.0とant-commons-net/Ant 1.10.18を確認しました。生成ツールの既存Log4j provider未検出ログとJavaのunchecked警告は残ります。

GitHub上のCI・Release、公開JARのダウンロード検証、Dependabot再評価は、レビュー・commit/push・merge・タグ公開後に確認します。

## 2026-10-28の生成ソース追跡解除に向けた確認

`blanco/main/`を含まない隔離コピーで、追跡対象だった生成Java 11ファイルとproperties 2ファイルの全13ファイルを、7つの`meta/program/`定義書から再生成しました。MavenとAntのどちらでも、再生成した13ファイルは元の作業ファイルとバイト単位で一致しました。独自修正の追加移植は必要ありませんでした。

JDK 17のMaven `clean verify`でSurefire 5件・Failsafe 3件が成功し、Ant 1.10.18の`build`も成功しました。Maven/Antの通常JARは本体15classがすべてmajor 52で、XMLと2つのpropertiesを含みます。Mavenのsources JARには11の生成Javaも含まれます。

この確認は、公開候補BeanUtils `1.1.2`を含む既存の検証用Mavenキャッシュを使い、オフラインで行いました。生成物のない状態からの再生成を確認したもので、外部公開URLからの取得・空キャッシュ検証とは区別します。

## 公開JARを手動で検証する場合

公開済みJARを手動で検証する場合は、テストclassと依存を用意した後、次を実行します。

```sh
mvn --batch-mode --no-transfer-progress test-compile
mvn --offline --batch-mode --no-transfer-progress \
  -Drelease.jar=/absolute/path/blanco-valueobject-2.2.0.jar \
  -Dsources.jar=/absolute/path/blanco-valueobject-sources-2.2.0.jar \
  failsafe:integration-test failsafe:verify
```

JAR指定の試験はソース側の本体classをclassloaderへ渡さず、指定した配布物の本体・リソース・生成・class形式・sourcesを検証します。

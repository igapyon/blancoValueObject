# blancoValueObject 上田版

このプロジェクトはblancoValueObjectの上田版です。
本家との相違は概ね以下の通りです。

* annotation 対応
* 明示的 import 対応
  * これは主に annotation のために用意しました。

## maven 対応について

### metaファイルからソースコードの生成

* プログラムに必要なコードの生成

```
mvn clean
mvn generate-sources
```

* テスト（テストmetaからのコードの生成）

```
mvn generate-test-sources
```

maven の特性上、lifecycle に沿ってすべての処理が実行されることに注意。

### ビルド・テストとJARの作成

```sh
mvn --batch-mode --no-transfer-progress clean verify
```

JDK 17、Maven 3.6.3以上を使用し、本体classはJava 8形式で生成します。`blanco-beanutils:1.1.2`の公開が前提です。公開先、回帰テスト、Ant、タグ起点のGitHub Releaseの手順は[運用手順](docs/OPERATIONS.md)を参照してください。

通常JARとsources JARは`target/blanco-valueobject-2.2.0.jar`と`target/blanco-valueobject-2.2.0-sources.jar`です。`verify`ではListコピー、Java生成・コンパイル、最終JARからのリソース読込と生成を確認します。

### 生成ソースのGit管理

`blanco/main/`は`meta/program/`の定義書と生成処理から再生成する出力で、Git管理外です。定義書・生成処理をGitで管理し、生成コードを修正する場合は元の定義書または生成処理へ反映します。生成物は強制追加せず、`git ls-files -- blanco/main`で追跡対象がないことを確認します。

新規チェックアウトでも`clean verify`とAntの`build`で必要なコードを生成します。通常JARには生成classと必要なリソース、sources JARには生成済みソースを引き続き含めます。

maven の特性上、lifecycle に沿ってすべての処理が実行されることに注意。

### Mavenリポジトリへのdeploy

GitHub ReleaseへのJAR添付とは別の操作です。以下は既存の`uedaueo`向けGitHub Pages公開設定を使用するため、権限と公開先を確認してから実行します。通常CI・Release workflowでは実行しません。

maven リポジトリは github 上のpublicリポジトリに作成される前提としてます。

```
mvn deploy
```

### 独自mavenリポジトリ

独自mavenリポジトリを作成したい場合は以下の手順で。

* https://github.com/uedaueo/blancofw-maven2 を clone
* github から access_key を取得
* pom.xml のリポジトリURLをclone先に変更

~/.m2/settings.xml に以下のように記述することで、deploy可能となります。（useridとaccess_keyは実在のものをご使用下さい）

```~/.m2/settings.xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>userid</username>
      <password>access_key</password>
    </server>
  </servers>
</settings>
```


## Ant ビルド

Java 17 以降、Maven 3.6.3 以降、Ant 1.10.18 を使用します。Ant は `pom.xml` から依存を `target/lib/` に取得してから生成・コンパイルします。Maven と Ant のclass出力はJava 8のAPI・bytecodeに揃えています。

```sh
ant build
```

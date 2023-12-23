# HTTPメソッドの実装
## 概要
アパレル店の商品情報をHTTPメソッドであるGET、 POST、 PATCH、 DELETEを使用して実装しています。
## 動作確認
### GET　（クエリ文字列を受け取る場合）
##### cURLコマンド
```curl --location 'localhost:8080/names?number=1'```

![GET](https://github.com/minori-oya/Project7/assets/138114043/ae54ffb7-a46f-4984-977b-aa54635d31d0)

### POST
##### cURLコマンド
```curl --location 'localhost:8080/names' \
--header 'Content-Type: application/json' \
--data '[
    {
        "number":4,
        "name":"ワンピース"
    },
    {
      "number":5,
      "name":"セーター"  
    }
]'
```
![POST](https://github.com/minori-oya/Project7/assets/138114043/eec8611e-bb36-49d3-b52a-ed28905b84a9)

### PATCH
##### cURLコマンド
```curl --location --request PATCH 'localhost:8080/names/3' \
--header 'Content-Type: application/json' \
--data ' {
        "number":3,
        "name":"サンダル"
 }
    '
```
![PATCH](https://github.com/minori-oya/Project7/assets/138114043/a546f55f-a216-4568-865f-e71dc8dd8113)

### DELETE
##### cURLコマンド
```curl --location --request DELETE 'localhost:8080/names/3' \
--header 'Content-Type: application/json' \
--data ' {
        "number":3,
        "name":"サンダル"
 }
    '
```
![DELETE](https://github.com/minori-oya/Project7/assets/138114043/10e06833-da4f-4933-9f87-8bf606388bd0)




package work7.raisetech.restapi.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import work7.raisetech.restapi.Controller.Form.ProductsCreateForm;
import work7.raisetech.restapi.Controller.Form.ProductsDeleteForm;
import work7.raisetech.restapi.Controller.Form.ProductsUpdateForm;
import work7.raisetech.restapi.Controller.Response.Products;
import work7.raisetech.restapi.Controller.Response.ProductsCreateResponse;
import work7.raisetech.restapi.Controller.Response.ProductsDeleteResponse;
import work7.raisetech.restapi.Controller.Response.ProductsUpdateResponse;

import java.util.List;
import java.net.URI;
import java.util.Map;


@RestController
public class ProductsController {

    //商品番号１〜３のデータを取得する
    @GetMapping("/names")
    public List<Products> products() {
        List<Products> products = List.of(
                new Products(1, "スウェット"),
                new Products(2, "パンツ"),
                new Products(3, "スニーカー"));
        return products;
    }

    //クエリ文字列を受け取れるようにする
    @GetMapping("/names2")
    public Map<Integer, String> getName(
            @RequestParam Integer Number, @RequestParam String Name) {
        return Map.of(1, "スウェット");
    }

    //新しい商品を登録する
    @PostMapping("/names")
    public ResponseEntity<ProductsCreateResponse> createResponse(
            @RequestBody List<ProductsCreateForm> productsCreateForm, UriComponentsBuilder uriComponentsBuilder) {
        List<ProductsCreateForm> cretateForm = List.of(
                new ProductsCreateForm(4, "ワンピース"),
                new ProductsCreateForm(5, "セーター"));

        URI url = uriComponentsBuilder
                .path("/names/{id}")
                .buildAndExpand(4, 5)
                .toUri();
        return ResponseEntity.created(url).body(new ProductsCreateResponse("新しい商品を登録しました"));
    }

    //商品番号３をスニーカーからサンダルに更新する
    @PatchMapping("names/{id}")
    public ResponseEntity<ProductsUpdateResponse> productsUpdateResponse(
            @PathVariable int id, @RequestBody ProductsUpdateForm productsUpdateForm) {
        return ResponseEntity.ok(new ProductsUpdateResponse("データを更新しました"));
    }

    //更新データを削除する
    @DeleteMapping("names/{id}")
    public ResponseEntity<ProductsDeleteResponse> productsDeleteResponse(
            @PathVariable int id, @RequestBody ProductsDeleteForm productsDeleteForm) {
        return ResponseEntity.ok(new ProductsDeleteResponse("更新データを削除しました"));
    }
}


package work7.raisetech.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import work7.raisetech.restapi.ProductsForm;
import work7.raisetech.restapi.ProductsResponse;

import java.util.HashMap;
import java.util.List;
import java.net.URI;
import java.util.Map;


@RestController
public class ProductsController {

    //商品番号１〜３のデータを取得し、クエリ文字列を受け取れるようにする
    @GetMapping("/names")
    public ResponseEntity<Map<String, String>> products(@RequestParam int number) {
        Map<Integer, String> productsList = new HashMap<>();
        productsList.put(1, "スウェット");
        productsList.put(2, "パンツ");
        productsList.put(3, "スニーカー");

        String productsName = productsList.get(number);
        return ResponseEntity.ok(Map.of("商品名", productsName));
    }

    //新しい商品を登録する
    @PostMapping("/names")
    public ResponseEntity<ProductsResponse> createResponse(
            @RequestBody List<ProductsForm> createForm, UriComponentsBuilder uriComponentsBuilder) {
        List<ProductsForm> createFormList = List.of(
                new ProductsForm(4, "ワンピース"),
                new ProductsForm(5, "セーター"));

        URI url = uriComponentsBuilder
                .path("/names/{id}")
                .buildAndExpand(4, 5)
                .toUri();
        return ResponseEntity.created(url).body(new ProductsResponse("新しい商品を登録しました"));
    }

    //商品番号３をスニーカーからサンダルに更新する
    @PatchMapping("names/{id}")
    public ResponseEntity<ProductsResponse> updateResponse(
            @PathVariable int id, @RequestBody ProductsForm updateForm) {
        return ResponseEntity.ok(new ProductsResponse("データを更新しました"));
    }

    //更新データを削除する
    @DeleteMapping("names/{id}")
    public ResponseEntity<ProductsResponse> deleteResponse(
            @PathVariable int id, @RequestBody ProductsForm deleteForm) {
        return ResponseEntity.ok(new ProductsResponse("更新データを削除しました"));
    }
}


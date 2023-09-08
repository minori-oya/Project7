package work7.raisetech.restapi.Controller.Response;

public class ProductsUpdateResponse {
    private String Message;

    public ProductsUpdateResponse(String message) {
        Message = message;
    }

    public String getMessage() {
        return Message;
    }
}

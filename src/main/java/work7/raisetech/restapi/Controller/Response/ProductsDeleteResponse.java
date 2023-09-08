package work7.raisetech.restapi.Controller.Response;

public class ProductsDeleteResponse {
    private String Message;

    public ProductsDeleteResponse(String message) {
        Message = message;
    }

    public String getMessage() {
        return Message;
    }
}

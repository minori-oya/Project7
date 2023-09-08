package work7.raisetech.restapi.Controller.Response;

public class ProductsCreateResponse {
    private String Message;

    public ProductsCreateResponse(String message) {
        Message = message;
    }

    public String getMessage() {
        return Message;
    }
}

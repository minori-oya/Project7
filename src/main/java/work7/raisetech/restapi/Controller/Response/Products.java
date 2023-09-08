package work7.raisetech.restapi.Controller.Response;

public class Products {
    private Integer Number;
    private String Name;

    public Products(Integer Number, String Name) {
        this.Number = Number;
        this.Name = Name;
    }

    public Integer getNumber() {
        return Number;
    }

    public String getName() {
        return Name;
    }
}

package work7.raisetech.restapi.Controller.Form;

public class ProductsCreateForm {
    private Integer Number;
    private String Name;

    public ProductsCreateForm(Integer Number, String Name) {
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

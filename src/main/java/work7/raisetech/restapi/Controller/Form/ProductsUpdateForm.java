package work7.raisetech.restapi.Controller.Form;

public class ProductsUpdateForm {
    private Integer Number;
    private String Name;

    public ProductsUpdateForm(Integer Number, String Name) {
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

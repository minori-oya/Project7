package work7.raisetech.restapi.Controller.Form;

public class ProductsDeleteForm {

    private Integer Number;
    private String Name;

    public ProductsDeleteForm(Integer number, String name) {
        Number = number;
        Name = name;
    }

    public Integer getNumber() {
        return Number;
    }

    public String getName() {
        return Name;
    }
}

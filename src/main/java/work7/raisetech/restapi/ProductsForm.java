package work7.raisetech.restapi;

public class ProductsForm {
    private Integer number;
    private String name;

    public ProductsForm(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

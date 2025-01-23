package estudos;

public class ProductPerishable extends Product{
    private String dataValidade;

    public ProductPerishable(String name, int price, int quantity, String dataValidade) {
        super(name, price, quantity);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de validade do produto: " + dataValidade;
    }
}


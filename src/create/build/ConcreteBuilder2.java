package create.build;

/**
 * @author Lenovo
 * @title: ConcreteBuilder2
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/14 15:13
 */
public class ConcreteBuilder2 extends Builder {

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

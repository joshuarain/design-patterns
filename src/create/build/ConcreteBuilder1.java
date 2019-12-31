package create.build;

/**
 * @author Lenovo
 * @title: ConcreteBuilder1
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/14 15:12
 */
public class ConcreteBuilder1 extends Builder {

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getProduct() {
        return product;
    }

}

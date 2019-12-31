package create.build;

/**
 * @author Lenovo
 * @title: Client
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/14 15:16
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.construct(builder1);
        Product p1 = builder1.getProduct();
        p1.show();

        director.construct(builder2);
        Product p2 = builder2.getProduct();
        p2.show();
    }
}

package create.factory;/**
 * @title: Client
 * @projectName DesignPattern
 * @description: TODO
 * @author Lenovo
 * @date 2019/12/31 14:13
 */

/**
 * @author: 张雷
 * @date: 2019/12/31 14:13
 */
public class Client {
    public static void main(String[] args) {
        Product product;
        //依赖注入，或读取XML
        Factory factory = new ConcreteFactory1();
        product = factory.newProduct();
        product.show();
    }
}

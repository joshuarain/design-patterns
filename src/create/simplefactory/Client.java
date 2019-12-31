package create.simplefactory;/**
 * @title: Client
 * @projectName DesignPattern
 * @description: TODO
 * @author Lenovo
 * @date 2019/12/31 14:33
 */

/**
 * @author: 张雷
 * @date: 2019/12/31 14:33
 */
public class Client {
    public static void main(String[] args) {
        Product product = new Factory().concreteProduct1();
        product.show();
    }
}

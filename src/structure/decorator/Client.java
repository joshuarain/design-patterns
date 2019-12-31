package structure.decorator;

/**
 * @author Lenovo
 * @title: Client
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/13 14:20
 */
public class Client {

    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA manDecoratorA = new ManDecoratorA();
        ManDecoratorB manDecoratorB = new ManDecoratorB();
        manDecoratorA.setPerson(man);
        manDecoratorB.setPerson(manDecoratorA);
        manDecoratorB.eat();
    }
}

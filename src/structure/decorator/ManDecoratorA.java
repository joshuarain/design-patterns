package structure.decorator;

/**
 * @author Lenovo
 * @title: ManDecoratorA
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/13 14:18
 */
public class ManDecoratorA extends Decorator {

    @Override
    public void eat() {
       super.eat();
        reEat();
        System.out.println("ManDecoratorA类");
    }

    public void reEat() {
        System.out.println("再吃一顿饭");
    }
}

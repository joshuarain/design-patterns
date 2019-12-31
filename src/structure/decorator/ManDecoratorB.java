package structure.decorator;

/**
 * @author Lenovo
 * @title: ManDecoratorA
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/13 14:18
 */
public class ManDecoratorB extends Decorator {

    @Override
    public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }


}

package structure.decorator;

/**
 * @author Lenovo
 * @title: Man
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/13 14:16
 */
public class Man implements Person {
    @Override
    public void eat() {
        System.out.println("男人在吃。");
    }
}

package create.build;

/**
 * @author Lenovo
 * @title: Builder
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/14 15:09
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getProduct();
}

package create.build;

/**
 * @author Lenovo
 * @title: Director
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/14 15:14
 */
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }

}

package create.single;

/**
 * @author Lenovo
 * @title: HungrySingleton
 * @projectName DesignPattern
 * @description: 饿汉模式
 * @date 2019/12/31 10:22
 */
public class HungrySingleton {

    private HungrySingleton(){}

    private static final HungrySingleton HUNGRY_SINGLETON=new HungrySingleton();

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }

}

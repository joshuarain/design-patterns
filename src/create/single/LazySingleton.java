package create.single;

/**
 * @author Lenovo
 * @date 2019/12/31 10:13
 */
public class LazySingleton {

    private LazySingleton(){}

    private static volatile LazySingleton lazySingleton;

    public static synchronized LazySingleton getInstance(){
        if(lazySingleton ==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}

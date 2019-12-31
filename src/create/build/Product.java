package create.build;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @title: Product
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/14 15:07
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("--- 产品创建 ---");
        for(String part : parts){
            System.out.println(part);
        }
    }
}

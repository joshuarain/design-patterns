//Source file: D:\\SimpleFactory\\Factory.java

package create.simplefactory;


public class Factory 
{
   
   /**
    * @roseuid 5E0AEB230290
    */
   public Factory() 
   {
    
   }
   
   /**
    * @return SimpleFactory.Product
    * @roseuid 5E0AEAA6029A
    */
   public Product concreteProduct1() 
   {
    return new ConcreteProduct1();
   }
   
   /**
    * @return SimpleFactory.Product
    * @roseuid 5E0AEADD0184
    */
   public Product concreteProduct2() 
   {
    return new ConcreteProduct2();
   }
}

package create.factory;//Source file: D:\\ConcreteFactory2.java


public class ConcreteFactory2 implements Factory
{
   
   /**
    * @roseuid 5E0AE5D8022E
    */
   public ConcreteFactory2() 
   {
    
   }
   
   /**
    * @return Product
    * @roseuid 5E0AE5D8025D
    */
   @Override
   public Product newProduct()
   {
    return new ConcreteProduct2();
   }
}

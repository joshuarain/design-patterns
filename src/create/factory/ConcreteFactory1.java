package create.factory;//Source file: D:\\ConcreteFactory1.java


public class ConcreteFactory1 implements Factory
{
   
   /**
    * @roseuid 5E0AE5D802CA
    */
   public ConcreteFactory1() 
   {
    
   }
   
   /**
    * @return Product
    * @roseuid 5E0AE5D802DA
    */
   @Override
   public Product newProduct()
   {
    return new ConcreteProduct1();
   }
}

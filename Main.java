//object class-> class to which every other class extends to 
//present there by default even if we dont write it

public class Main {

       public static void main(String[] args) {
              Laptop obj = new Laptop(1200, "Macbook");
              // obj.getClass();
              // obj.hashCode();
              // obj.toString(); // methods are there even if no method is present in Laptop class

              System.out.println(obj); //o/p -> Laptop@2a139a55
              //by default obj.toString() is called which gives us the abv output
              // System.out.println(obj.toString()); //this is called abv by default and has the same output which is Laptop@2a139a55

              Laptop obj1 = new Laptop(1200, "Macbook");
              System.out.println(obj1);

              boolean isObjectSame = obj.equals(obj1);

              System.out.println(isObjectSame); //false 
              //both objects may have same values but are differnet objects

       }
}

class Laptop {
       // this class extends to Object class by default
       // even if we dont write it
       // We dont have any methods defined inside the class
       // but still we can perform various methods in the main class
       // have a look abv

       private int price;
       private String model;

       public Laptop(int price, String model) {
              this.model = model;
              this.price = price;
       }

       //what if instead of having toString of object class
       //we define one for this class only
       public String toString(){
              return model + " : " + price;
       }

       @Override
       public int hashCode() {
              final int prime = 31;
              int result = 1;
              result = prime * result + price;
              result = prime * result + ((model == null) ? 0 : model.hashCode());
              return result;
       }

       @Override
       public boolean equals(Object obj) {
              if (this == obj)
                     return true;
              if (obj == null)
                     return false;
              if (getClass() != obj.getClass())
                     return false;
              Laptop other = (Laptop) obj;
              if (price != other.price)
                     return false;
              if (model == null) {
                     if (other.model != null)
                            return false;
              } else if (!model.equals(other.model))
                     return false;
              return true;
       }

       
}
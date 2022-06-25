
public class Car {
    String color="red";
    String name="tesla";
       int model=2018;     //car attributes also called fields
       int speed=200;      
    
              //  also we can add methods/functions of car here and call it in main
    
    public static void main(String[] args) {
        
        Car mycar = new Car();   //mycar object of class Car also can create many objects
                           //also attributes can be initialize here i.e mycar.model=2019;

        System.out.println("my car name is= "+mycar.name);
      System.out.println("my car color is= "+mycar.color);
      System.out.println("my car model is= "+mycar.model);
 
    }
}

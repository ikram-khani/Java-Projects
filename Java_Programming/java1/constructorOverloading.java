//ooverloading constructor

class circleA{
    
    // witout parameter constructor
    public circleA(){

        float area=30.0f;
        float radius=10.0f;

        System.out.println("radius= "+radius);
        System.out.println("area = "+area);

    }
    //takes one parameter

    public circleA(float r){
        float radius=r;
        System.out.println("radius= "+radius);
    }

    // takes two parameters

    public circleA(float r, float a){
      float radius=r;
       float area=a;
       System.out.println("radius = "+radius);
       System.out.println("area = "+area);
    }
}

    // and so on you can use many constructor in a single class and this is called ooverloading constructor
   
   
   
   
    public class constructorOverloading{
  

    public static void main(String[] args) {
        
     circleA c1= new circleA();
     circleA c2= new circleA(10.8f);
     circleA c3= new circleA(3.9f,15.0f);

        // constructors are automatically called when their subjects are created
    }
}

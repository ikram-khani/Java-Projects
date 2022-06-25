import java.util.Scanner;
 class circle {
    
    public double circumf;
    public double area;
    

    //creating functions/methods of a class for area,circumference,and radius

    public void showRadius(float r) {    //get the float value into 'r' variable from the calling 

        System.out.println("the radius is= "+r);
    }  
    

    public void calculateCircumf(float r) {
        circumf=2*3.14*r;
        System.out.println("the circumference= "+circumf);
    }
    

    public void calculateArea(float r) {

        area=3.14*r*r;
        System.out.println("the area is "+area);
        
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        float radius;
        System.out.println("enter the radius");
        radius=s. nextInt();
        
        //creating objects of class circle 
        
        circle c1=new circle();
        circle c2=new circle();
        circle c3=new circle();
    
        
          //calling the functions/methods
        c1.showRadius(radius);  //pass the radius value to 'r' in methods
        c2.calculateCircumf(radius);
        c3.calculateArea(radius);

        s.close();
    }
    
}

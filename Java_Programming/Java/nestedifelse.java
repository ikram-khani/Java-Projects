import java.util.Scanner;
public class nestedifelse {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
    int marks;
    System.out.println("Enter your marks: ");
    marks=sc.nextInt();

    sc.close();

    if(marks>=90&& marks<=100)
    {
        System.out.println("you have gpa=4.0");
    }
    else
    if(marks>=80&&marks<=89){
        System.out.println("you have gpa=3.7");

    }
    else
    if(marks>=70&&marks<=79)
    {
        System.out.println("you have gpa=3.3");

    }
    else 
    if(marks>=60&&marks<=69){
        System.out.println("you have gpa=2.8");

    }
    else if(marks>=50&&marks<=59){
        System.out.println("you have gpa=2.3");

    }
    else if (marks<50){
        System.out.println("sorry you are failed");
    }
        
    }
    
    
}

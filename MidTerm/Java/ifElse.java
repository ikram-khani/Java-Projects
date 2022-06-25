import java.util.Scanner;
public class ifElse {
    

public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    int marks;
    System.out.println("enter your marks: ");
    marks=S.nextInt();
    
    S.close();

    /*if else statement*/
    if(marks>=40){
       System.out.println("congrats your paper is passed ");
    }
    else 
    System.out.println("your paper is failed ");
    
}
}
import java.util.Scanner;
public class addNumber1 {
    public static void main(String[] args) {

        int a,b,sum;
    Scanner sc= new Scanner(System.in);
    
    System.out.println("enter a: ");
    a=sc.nextInt();
    System.out.println("enter b: ");
    b=sc.nextInt();
    sc.close();
    sum=a+b;
    System.out.println("the sum of a and b is : "+sum);    
    }
}

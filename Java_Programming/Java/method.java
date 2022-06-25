/**
 * method
 */
import java.util.Scanner;
public class method {

  static void Add(int n1, int n2){     //the calling method
       int sum;
       sum=n1+n2;

       System.out.println("the sum of num1 and num2 is: " +sum);

    }

    public static void main(String[] args) {

        int num1,num2;
        Scanner input =new Scanner (System.in);
        System.out.println("enter the first number: ");
        num1=input.nextInt();
        System.out.println("enter the second number : ");
        num2=input.nextInt();
        Add(num1,num2);  //called method here it is called ,and pass num1 and num2 to the calling method and put to n1 and n2
        input.close();
        
        


    }
}
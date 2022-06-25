
package return_method;

import java.util.Scanner;
public class Return_method {
    
    static int Add(int n1, int n2){
    int sum=n1+n2;
    return sum;
    
    }
    

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=s.nextInt();
        System.out.println("Enter number 2");
        int num2=s.nextInt();
        
       
       int result=Add(num1,num2); //calling 
        System.out.println("the sum is="+result);
    }
    
}
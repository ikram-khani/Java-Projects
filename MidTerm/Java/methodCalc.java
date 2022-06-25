/**
 * methodCalc
 */
import java.util.Scanner;
public class methodCalc {

    //   create method for each operation
    

    static void Add(int n1, int n2){
    
        int sum;
        sum=n1+n2;
       System.out.println("The result= "+sum);

    }

    static void Sub(int n1, int n2){
    
        int sub;
       sub =n1-n2;
       System.out.println("The result= "+sub);

    }

    static void Mul(int n1, int n2){
    
        int mul;
        mul=n1*n2;
       System.out.println("The result= "+mul);

    }

    static void Div(int n1, int n2){
    
        int div;
        div=n1/n2;
       System.out.println("The result= "+div);

    }

    static void Mod(int n1, int n2){
    
        int mod;
        mod=n1%2;
       System.out.println("The result= "+mod);

    }


    public static void main(String[] args) {

        int num1,num2,choice,choice1;
        Scanner input =new Scanner (System.in);
     do{   //for doing the calculation again and again use do while
  
        // take input from the users
        
        System.out.println("enter the first number: ");
        num1=input.nextInt();
        System.out.println("enter the second number : ");
        num2=input.nextInt();
// for users choice
        System.out.println("\n addition....1 \n substraction....2 \n multiplication....3 \n division....4\n Modulas....5\n");
        System.out.println("enter your choice: ");
        choice=input.nextInt();

    // use switch for calling the method
        switch (choice) {
            case 1:
            Add(num1,num2);
                
                break;

            case 2:
            Add(num1,num2);
               
             break;

             case 3:

             Add(num1,num2);
             break;

            case 4:
            Add(num1,num2);
              break;

            case 5:
            Add(num1,num2);
              break;
        
            default:
             System.out.println("You entered an invalid choice ");
                break;
        }
        
        System.out.println("Do you want to do another calculation? \n If yes enter 1 \n If no enter 0 ");
        choice1=input.nextInt();
        

         }
        while(choice1==1);
        input.close();
    }
}
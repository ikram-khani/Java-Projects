import java.util.Scanner;
public class returnMethodCal {

    //return method for all operations
    static int Add(int n1, int n2){

        return n1+n2;
    }

    static int Sub(int n1, int n2){

        return n1-n2;
    }

    static int Mul(int n1, int n2){

        return n1*n2;
    }

    static int Div(int n1, int n2){

        return n1/n2;
    }

    static int Mod(int n1, int n2){

        return n1%n2;
    }
    public static void main(String[] args) {
        
        int num1,num2,result;
        char operator,choice;

        do{
            //inputs from the users
            Scanner s=new Scanner(System.in);
           System.out.println("enter 1st number: ");
           num1=s.nextInt();
           System.out.println("enter 2nd number: ");
           num2=s.nextInt();
           System.out.println("enter the operator (+,-,*,/,%) ");
           operator=s.next().charAt(0); //scanner for character

           //switch statement for the operation choice
           switch (operator) {
               case '+':
                  result= Add(num1,num2);
                  System.out.println("the result is= "+result);
                     

                   break;

                   case '-':
                  result= Sub(num1,num2);
                  System.out.println("the result is= "+result);
                     

                   break;

                   case '*':
                  result= Mul(num1,num2);
                  System.out.println("the result is= "+result);
                     

                   break;

                   case '/':
                  result= Div(num1,num2);
                  System.out.println("the result is= "+result);
                     

                   break;

                   case '%':
                  result= Mod(num1,num2);
                  System.out.println("the result is= "+result);
                     

                   break;
           
               default:

               System.out.println("you have entered an invalid choice!");
                   break;
           }

           System.out.println("Do you want to repeat the operation \n y for yes, and n for no ");
           choice=s.next().charAt(0);
        
          
        }
          
        while(choice=='y'|| choice=='Y');
    }
    
}

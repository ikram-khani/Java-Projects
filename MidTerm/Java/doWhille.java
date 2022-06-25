import java.util.Scanner;
public class doWhille {
    public static void main(String[] args) {
        
        int num1, num2, result, choice1 ,choice2;
        Scanner s=new Scanner(System.in);

        //  use  do for the whole calculation program

        do{
          

            //  inputs fom users

            System.out.println("Enter the first value: ");
            num1=s.nextInt();
            System.out.println("Enter the second value: ");
            num2=s.nextInt();
         System.out.println(" \n Addition........1 \n subtraction.....2 \n multiplication..3 \n division........4 \n modulus.........5 \n ");
            System.out.println("Enter your choice: ");
            choice1=s.nextInt();

                   /*switch statement*/
                //    use for multiple choice of operations

         switch (choice1) {     /* use choice1 b/c user will enter the values of cases in choice1 variable*/
           
            case 1:
             result=num1+num2;
                System.out.println("the result = "+result);
                break;
            case 2:
              result=num1-num2;
                System.out.println("the result= "+result);
                break;
            case 3:
              result=num1*num2;
                System.out.println("the result= "+result);
                break;
            case 4:
             result=num1/num2;
                System.out.println("the result= "+result);
                break;
            case 5:
              result=num1%num2;
                 System.out.println("the result= "+result);
                 break;
        
            default:
                System.err.println("you entered an invalid choice");

                break;
        }

        //  for doing once again

        System.out.println("Do you want to do another calculation? \n If yes Enter 1 \n If no Enter  0 ");
        choice2=s.nextInt();
        
            
        }
    while (choice2==1);        /* use choice2 because user will enter the condition value in choice2 variable*/
    s.close();
    
    }
    

    
}

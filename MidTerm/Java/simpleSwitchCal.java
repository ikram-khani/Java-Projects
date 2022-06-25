import java.util.Scanner;
public class simpleSwitchCal {
    public static void main(String[] args) {

          /* inputs from the users*/
        int num1 ,num2, choice,result;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first value: ");
        num1=s.nextInt();
        System.out.println("enter the second value: ");
        num2=s.nextInt();
        System.out.println("\n addition....1 \n substraction....2 \n multiplication....3 \n division....4\n Modulas....5\n");
        System.out.println("enter your choice: ");
        choice=s.nextInt();

        s.close();

         /*switch statement*/

        switch (choice) {
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

    }
}

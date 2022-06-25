
import java.util.Scanner;
 class Calc {
     public double x;
     public double y;
     public int choice;
     public double result;
    Scanner s=new Scanner(System.in);
    public void input(){

        System.out.println("Enter the value of x: ");
        x=s.nextInt();
        System.out.println("Enter the value of y: ");
        y=s.nextInt();
        System.out.println("For Arithematic operations, Enter 1 \n For Trigonomatic functions, Enter 2 ");
        choice=s.nextInt();

        switch (choice) {
            case 1:
              arithematic a=new arithematic();
              a.arithematicOp(x,y);
                
                break;
           case 2:
             trigonomatic t=new trigonomatic();
             t.trigonomaticFn(x,y);
             break;
            default:               
                System.out.println("invalid choice!");
        }
    }    
}
      
        class arithematic extends Calc {
                public char choice;
         public void  arithematicOp(double x, double y){
             
            System.out.println("what kind of operation do you want to do: \n (+,-,*,/,%)");
             choice=s.next().charAt(0);
            
             switch (choice) {
                 case '+':
                     result=x+y;
                    System.out.println("the result is= "+result);

                     break;
               case '-':
               result=x-y;
               System.out.println("the result is= "+result);
                     break;
                case '*':
                result=x*y;
                System.out.println("the result is= "+result);
                     break;
                 case '/':
                 result=x/y;
                 System.out.println("the result is= "+result);
                     break;
                  case '%':
                  result=x%y;
                  System.out.println("the result is= "+result);
                     break;            
                 default:
                    System.out.println("Invalid choice!");
                     break;
             }
          }           
       }

        class trigonomatic extends Calc  {
            public String choice;
          public void trigonomaticFn(double x,double y){
           
              System.out.println("What kind of trigonomatic function do you want to use! \n (sin,cos,tan,sinh,cosh,tanh,log,log10,log1p,exp,pow)");
                  choice=s.nextLine();
                
               switch (choice) {                
                case"sin":
                x=Math.toRadians(x);
                 System.out.println("the sin of  "+x+" in Radians is= "+Math.sin(x));                
                 y=Math.toRadians(y);
                 System.out.println("the sin of "+y+" in Radians is= "+Math.sin(y));   
                       break;

                 case "cos":                
                x=Math.toRadians(x);
                 System.out.println("the cos of "+x+" in Radians is= "+Math.cos(x));              
                y=Math.toRadians(y);
                 System.out.println("the cos of "+y+" in Radians is= "+Math.cos(y));           
                       break;

                 case "tan":
                 x=Math.toRadians(x);
                      { System.out.println("the tan of "+x+" in Radians is= "+Math.tan(x));}
                      y=Math.toRadians(y);
                       System.out.println("the tan of "+y+" in Radians is= "+Math.tan(y));                
                       break;
        case "sinh":
            x=Math.toRadians(x);
                      { System.out.println("the sinh of "+x+" in Radians is= "+Math.sinh(x));}                  
                      y=Math.toRadians(y);
                       System.out.println("the sinh of "+y+" in Radians is= "+Math.sinh(y));
                       break;

          case "cosh":
                x=Math.toRadians(x);
                       System.out.println("the cosh of "+x+" in Radians is= "+Math.cosh(x));
                      y=Math.toRadians(y);
                       System.out.println("the cosh of "+y+" in Radians is= "+Math.cosh(y));
                       break;
           
            case "tanh":            
                     x=Math.toRadians(x);
                       System.out.println("the tanh of "+x+" in Radians is= "+Math.tanh(x));
                       y=Math.toRadians(y);                       
                       System.out.println("the tanh of "+y+" in Radians is= "+Math.tanh(y));
                       break;
           
            case "log":         
                       System.out.println("the log of "+x+" is= "+Math.log(x));                      
                       System.out.println("the log of "+y+" is= "+Math.log(y));               
                       break;

            case "log10":          
                       System.out.println("the log10 of "+x+" is= "+Math.log10(x));
                       System.out.println("the log10 of "+y+" is= "+Math.log10(y));
                       break;

           case "log1p":         
                       System.out.println("the log(x+1) of "+x+" is= "+Math.log1p(x));
                       System.out.println("the log(x+1) of "+y+" is= "+Math.log10(y));                
                       break;

         case "exp":     
                       System.out.println("the exponentional of "+x+" is= "+Math.exp(x));
                       System.out.println("the exponentional of "+y+" is= "+Math.exp(y));           
                      break;
         
             case "pow":
                       System.out.println("the power of "+x+","+y+" is= "+Math.pow(x,y));
                       break;          
                   default:
                   System.out.println("Invalid choice!");
            }
        }
              
       }
public class Calculator {

    public static void main(String[] args) {
        int choice;
        System.out.println("Name:Ikram_khan\t\tRoll no:BSSE_201116\t\tDegree name:BS_Software_Engineering\nSemester:3rd\t\tSection:A\t\t\tAssignment:Java\nSubmitted To:Dr.Irshad_Saib\t\t\t\tDate:15th_November_2021\n\nCALCULATOR");
do {
    
    Scanner s=new Scanner(System.in);
    Calc c=new Calc();
        c.input();
        System.out.println("Do you want another calculation? \n if yes Enter 1\n if no enter 2 ");
        choice=s.nextInt();
        
} while (choice==1);        
    }
}
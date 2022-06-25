
package max;

import java.util.Scanner;
public class Max {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Enter a ");
        a=s.nextInt();
        System.out.println("Enter b ");
        b=s.nextInt();
        System.out.println("Enter c ");
        c=s.nextInt();
        
        if(a>b&&a>c)
            System.out.println("the largest number is "+a);
        
         else if(b>a&&b>c)
            System.out.println("the largest number is "+ b);
          
          else  if(c>b&&c>a)
            System.out.println("the largest number is "+c);
    }
    
}

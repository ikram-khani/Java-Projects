
package finding_max_inarray;

import java.util.Scanner;
public class Finding_Max_inArray {

    
    public static void main(String[] args) {  
        int A[]=new int[20];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for(int i=0; i<A.length; i++)
            A[i]=s.nextInt();
        
        int max=0;
        for(int i=0; i<A.length; i++ )
        {
        if(A[i]>max)
            max=A[i];
        }
        System.out.println("The largest number is "+max);
    }
    
    
}

import java.util.Scanner;
public class matrixMult {
    public static void main(String[] args) {
       

        int A[][]=new int [3][3];
        int B[][]=new int [3][3];
        int C[][]=new int [3][3];


        Scanner s=new Scanner(System.in);
        System.out.println("enter the matrix  A");

        // for matrix A inputs
        for (int i=0; i<A.length; i++)
        for (int j=0; j<A.length; j++){
        System.out.print("A["+i+"]["+j+"]=");
        A[i][j]=s.nextInt();}

        System.out.println("enter the matrix  B");

        // for matrix B inputs
        for (int i=0; i<B.length; i++)
        for (int j=0; j<B.length; j++){
        System.out.print("B["+i+"]["+j+"]=");
        B[i][j]=s.nextInt();}

        //matrix A output
        System.out.println("matrix A");
        for (int i=0; i<A.length; i++){
        for (int j=0; j<A.length; j++){
        System.out.print(A[i][j]+",");
        }
        System.out.println();
        }
       
        //matrix B output
        System.out.println("matrix B");
        for (int i=0; i<B.length; i++){
        for (int j=0; j<B.length; j++){
        System.out.print(B[i][j]+",");
        }
        System.out.println();
        }
           //matrix C

        System.out.println("the Multiplication of matrix A*B=C is:");
        for(int i=0; i<C.length; i++){
        for(int j=0; j<C.length; j++){
        for(int k=0; k<C.length; k++){
            C[i][j]=C[i][j]+A[i][k]*B[k][j];

        }
        }
        } 
        //output of C

        System.out.println("Matrix C:");

        for(int i=0; i<C.length; i++){
        for(int j=0; j<C.length; j++){

            System.out.print(C[i][j]+",");

        }
        System.out.println();
        }
        s.close(); 
    }
}

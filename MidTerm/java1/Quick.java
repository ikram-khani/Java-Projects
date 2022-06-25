public class Quick {
    int partition(int A[],int low,int high){
    
        int pivot=A[high];
        int i=(low -1);
        
  for(int j=low; j<high; j++){
  
      if (A[j]<=pivot){
      i++;

      int temp=A[i];
      A[i]=A[j];
      A[j]=temp;
         

      }
    

              
     }
  int temp=A[i+1];
  A[i+1]=A[high];
  A[high]=temp;
  return(i+1);
        
    }
    void quick(int A[], int low,int high){
        if (low<high){
            int loc=partition(A, low, high);
                quick(A, low, loc-1);
                quick(A, loc+1, high);
        }

    }
    void printArr(int A[],int n){

        for(int i=0; i<n; i++)
        System.out.print(A[i]+" ");
    }
    public static void main(String[] args) {
        int A[]={13,18,35,2,19,27};
        int n=A.length;
        System.out.println("\n before sorting array elements are ");
        Quick q1=new Quick();
        q1.printArr(A, n);
        q1.quick(A, 0, n-1);
        System.out.println("\n after sorting array elements are ");
        q1.printArr(A, n);
    }
}

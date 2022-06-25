public class arrayMin {

    static int numbers[]={4,8,10,56,34,3,58};
 
     static int smallest (){
        int i;
         
 
         int min=numbers[0];
         
     for ( i = 1; i < numbers.length; i++) 
             if(numbers[i]<min)
             min=numbers[i];
         
             return min;
             
         
     
     }
     public static void main(String[] args) {
         
         System.out.println("the minimum number in the array is= "+smallest());
     }
     
 }
 

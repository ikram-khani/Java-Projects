public class arrayMax {

   static int numbers[]={2,8,10,56,34,3,58};

    static int largest (){
       int i;
        

        int max=numbers[0];
        
    for ( i = 1; i < numbers.length; i++) 
            if(numbers[i]>max)
            max=numbers[i];
        
            return max;
            
        
    
    }
    public static void main(String[] args) {
        
        System.out.println("the maximum number in the array is= "+largest());
    }
    
}

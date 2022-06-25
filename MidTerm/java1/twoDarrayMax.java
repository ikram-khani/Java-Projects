public class twoDarrayMax {
    
    
    static int largest(){

        

        // array
       int numbers[][]={
            {3,2,5},
            {1,8,6},
            {4,11,7}
        };

        int max=numbers[0][0];

        for(int i=0; i<numbers.length; i++)
        for(int j=0; j<numbers.length; j++)

        if (numbers[i][j]>max) 
         
        max=numbers[i][j];
        return max;
            
        
    }
    public static void main(String[] args) {
        System.out.println("the largest number in the array is= "+largest());
    }
}

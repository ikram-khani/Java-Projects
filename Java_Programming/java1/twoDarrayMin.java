public class twoDarrayMin {
    
    
    static int smallest(){

        

        // array
       int numbers[][]={
            {2,3,5},
            {1,9,6},
            {4,6,7}
        };

        int min=numbers[0][0];

        for(int i=0; i<numbers.length; i++)
        for(int j=0; j<numbers.length; j++)

        if (numbers[i][j]<min) 
         
        min=numbers[i][j];
        
        
    
    return min;

            
        
    }
    public static void main(String[] args) {
        System.out.println("the smallest number in the array is= "+smallest());
    }
}

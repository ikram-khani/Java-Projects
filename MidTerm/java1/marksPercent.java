/**
 * marksPercent
 */
import java.util.Scanner;
public class marksPercent {

    public static void main(String[] args) {
      
      
        int Marks[]=new int [6];

        float obtained=0;
      float percentage;
      final float total=600;

        Scanner input=new Scanner(System.in);
        System.out.println("enter the marks of your subjects: ");
        for(int i=0; i<Marks.length; i++)
        {
           Marks[i]=input.nextInt();
        }
        for(int i=0; i<Marks.length; i++){
            obtained=obtained+Marks[i];
        }
    
        percentage=(obtained/total)*100;
        System.out.println("your marks percentage is= "+percentage+"%");
        input.close();
    }
}
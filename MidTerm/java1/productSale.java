import java.util.Scanner;
public class productSale {
    public static void main(String[] args) {
        int searchno;
        int productCode[]={102,150,250,300,325,634};
        int productSale[]={20,25,30,50,40,70};    //parellel arrrays
      Scanner in=new Scanner(System.in);
      System.out.println("enter the product code for finding product sale:");
      searchno=in.nextInt();
      for(int i=0; i<productCode.length; i++)
      {
          if(searchno==productCode[i])
          {
              System.out.println("the sale on product code "+productCode[i]+" is :"+productSale[i]+"%");
          }
      }
  in.close();
    }
}

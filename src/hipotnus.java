 import  java.util.Scanner;
public class hipotnus {
    public  static void main(String[]args){
        Scanner brt =new Scanner(System.in);

         System.out.println("birinci kenarı giriniz ");
         int bır =brt.nextInt();

         System.out.println("ikinci  kenarı giriniz ");
         int iki =brt.nextInt();

         double hıp=Math.sqrt((iki*iki)+(bır*bır));
         System.out.println("hipotenüs = "+hıp );

         double alan=( bır*iki)/2;
         System.out.println("alan="+alan);

    }
}

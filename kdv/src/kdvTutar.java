import java.util.Scanner;


public class kdvTutar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar, kdvOran;

        System.out.print("Lütfen ürün tutarını giriniz : ");
        tutar = input.nextDouble();

        kdvOran = (tutar < 1000) && (tutar > 0) ? 0.18 : 0.08;

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("ürün tutarı : " + tutar);
        System.out.println("kdv tutarı :" + kdvTutar);
        System.out.println("kdvli tutar" + kdvliTutar);
        System.out.println("kdv oranı :" +kdvOran);




    }
}

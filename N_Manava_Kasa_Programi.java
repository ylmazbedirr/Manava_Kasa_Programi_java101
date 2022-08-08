import java.util.Scanner;
public class N_Manava_Kasa_Programi {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;

        double armutTutar = 2.14;
        double elmaTutar = 3.67;
        double domatesTutar = 1.11;
        double muzTutar = 0.95;
        double patlicanTutar = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? :" );
        armut = input.nextDouble();

        System.out.print("Elma Kac Kilo ? :");
        elma = input.nextDouble();

        System.out.print("Domates Kac Kilo ? :");
        domates = input.nextDouble();

        System.out.print("Muz Kac Kilo ? :");
        muz = input.nextDouble();

        System.out.print("Patlican Kac Kilo ? :");
        patlican = input.nextDouble();

        double toplam = (armut*armutTutar) + (elma*elmaTutar) + (domates * domatesTutar) + (muz*muzTutar) + (patlican*patlicanTutar);

        System.out.println("Toplam Tutar :" + toplam + "TL");

    }
}

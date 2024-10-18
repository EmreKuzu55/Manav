package notort;

import java.util.Scanner;

public class Manav {

	public static void main(String[] args) {

			Double Armut = 2.14, Elma =3.67, Domates= 1.11, Muz = 0.95, Patlıcan = 5.00;
		int Armutk, Elmak, Domatesk, Muzk, Patlıcank;
			
			Scanner inp = new Scanner(System.in);
			System.out.print("Armut Kaç Kilo ? :");
			Armutk = inp.nextInt();
			
			System.out.print("Elma Kaç Kilo ? :");
			Elmak = inp.nextInt();
			
			System.out.print("Domates Kaç Kilo ? :");
			Domatesk = inp.nextInt();
			
			System.out.print("Muz Kaç Kilo ? :");
			Muzk = inp.nextInt();
			
			System.out.print("Patlıcan  Kaç Kilo ? :");
		     Patlıcank = inp.nextInt();
			
		
	    Double total=  (Armut*Armutk)+(Elmak*Elma)+(Domatesk*Domates)+(Muzk*Muz)+(Patlıcank*Patlıcan);
		
		
		System.out.println("Toplam Tutarınız : "+total);
		
		
		
		
		
		
	} 

}
 
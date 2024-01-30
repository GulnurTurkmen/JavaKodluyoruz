package Java101;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	int mat, fiz, kim , turkc, muz;
	Scanner inp= new Scanner(System.in);
	System.out.println("mat notunuz:");
	System.out.println("fizik notunuz:");
	System.out.println("kimya notunuz:");
	System.out.println("türkçe notunuz:");
	System.out.println("müzik notunuz:");

	mat = inp.nextInt();
	fiz = inp.nextInt();
	kim = inp.nextInt();
	turkc = inp.nextInt();
	muz = inp.nextInt();
	
	int top =(mat+fiz+kim+turkc+muz);
	double sonuc = top/6;
	System.out.println("Sonucunuz:" +sonuc);
	String durum = sonuc >= 60 ? "Geçti" : "Kaldı";
	System.out.println("Durum:" +durum);
}
}

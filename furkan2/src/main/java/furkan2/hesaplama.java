package furkan2;
import java.math.BigDecimal;
import java.util.*;
public class hesaplama {
	 public static String topla (String sayi1,String sayi2) {
		 try {
		 return new BigDecimal(sayi1)
				 .add(new BigDecimal(sayi2))
				 .toPlainString();
		 }catch(Exception e) {
			 return "undefined";
		 }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner konsoloku = new Scanner(System.in);
		System.out.print("sayı1i giriniz");
		String sayi1 = konsoloku.nextLine();
		System.out.print("sayı2yi giriniz");
		String sayi2 = konsoloku.nextLine();
		String sonuc =hesaplama.topla(sayi1,sayi2);
		System.out.printf("%s + %s =%s", sayi1 , sayi2,sonuc);
	}

}

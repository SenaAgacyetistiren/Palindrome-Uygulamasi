
import java.util.Random;
public class odev {
	

	public static void ekranaYazdir(int[][] dizi) {
		for(int i=0; i<dizi.length;i++) {
			for(int j=0; j<dizi[i].length;j++) {
				System.out.print(dizi[i][j]+ " ");
		}
			System.out.println();
		}
	}
	
	public static boolean Palindrom(int sayi) {
		int tersSayi=0;
		int orjSayi= sayi;
		while(sayi != 0) {
			int sonRakam = sayi %10;
			tersSayi = tersSayi *10 +sonRakam;
			sayi /=10;
		}
		return orjSayi == tersSayi;
	}
	
	public static int palindromaCevir(int sayi) {
		int orjSayi= sayi;
		int tersSayi=0;
		while(sayi !=0) {
			int sonRakam = sayi % 10;
			tersSayi = tersSayi * 10 +sonRakam;
			sayi /=10;
		}
		return orjSayi *1000 + tersSayi;
	}
	
	
	public static void main(String[] args) {
		

			int[][] dizi = new int [3][3];
			
			Random random = new Random();
			
			for(int i =0; i<dizi.length; i++) {
				for(int j=0; j<dizi[i].length; j++)
				dizi[i][j]= random.nextInt(900)+100;
			}
			
			System.out.println("Oluşturulan Dizi: ");
			System.out.println();
			ekranaYazdir(dizi);

			
			System.out.println("\n-----------------------");
			
			for(int i=0; i<dizi.length;i++) {
				for(int j =0; j<dizi[i].length;j++)
					if(!Palindrom(dizi[i][j])) {
						dizi[i][j] = palindromaCevir(dizi[i][j]);
					}
			}
			
			System.out.println("\nPalindroma Çevrilen Dizi: ");
			System.out.println("");
			ekranaYazdir(dizi);
 
}
}


package rekursif;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Rekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai;

        System.out.print("Masukan nilai kali : ");
        nilai = input.nextInt();
        cetakAngka(nilai);
        
    }

	static void cetakAngka(int angka) {
		if (angka <= 1000) {
			System.out.println(angka + " ");
			cetakAngka(angka*=angka);

		}
	}  
}

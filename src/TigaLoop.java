import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        // Membaca input dari keyboard
        Scanner input = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println("\n===== SATU DERET, TIGA LOOP =====");

        // 1. Perulangan dengan FOR
        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Perulangan dengan WHILE
        System.out.print("while    : ");
        int w = 1;
        while (w <= n) {
            System.out.print(w + " ");
            w++;
        }
        System.out.println();

        // 3. Perulangan dengan DO-WHILE
        System.out.print("do-while : ");
        int dw = 1;
        do {
            System.out.print(dw + " ");
            dw++;
        } while (dw <= n);
        System.out.println("\n");

        // Pembuktian Meleset Satu (Off-by-One)
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // Saringan Deret 1-10 (continue & break)
        System.out.print("Disaring : ");
        int cetakCount = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Melewati angka genap
            }
            if (i > 7) {
                break; // Berhenti jika i lebih dari 7
            }
            System.out.print(i + " ");
            cetakCount++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + cetakCount + " kali");

        input.close();
    }
}

/*
 =========================================================================
 KELUARAN SAAT RUN 1 (n = 5):
 -------------------------------------------------------------------------
 Batas deret (n) : 5

 ===== SATU DERET, TIGA LOOP =====
 for      : 1 2 3 4 5 
 while    : 1 2 3 4 5 
 do-while : 1 2 3 4 5 

 i <  n berputar : 4 kali
 i <= n berputar : 5 kali
 Disaring : 1 3 5 7 
 Sampai println  : 4 kali

 -------------------------------------------------------------------------
 KELUARAN SAAT RUN 2 (n = 0):
 -------------------------------------------------------------------------
 Batas deret (n) : 0

 ===== SATU DERET, TIGA LOOP =====
 for      : 
 while    : 
 do-while : 1 

 i <  n berputar : 0 kali
 i <= n berputar : 0 kali
 Disaring : 1 3 5 7 
 Sampai println  : 4 kali

 =========================================================================
 PENJELASAN KHUSUS & KESIMPULAN:
 1. Kenapa baris do-while mencetak "1" saat n = 0?
    do-while mengecek kondisinya sesudah badan loop dijalankan, jadi badannya pasti jalan minimal sekali.
    
 2. Kenapa loop tidak berhenti di i = 8 padahal 8 > 7?
    Karena saat i = 8 (genap), perintah `if (i % 2 == 0) continue;` dieksekusi 
    terlebih dahulu, sehingga melompati sisa perintah di bawahnya (termasuk pemeriksaan break). 
    Loop baru memeriksa `if (i > 7) break;` saat i = 9 (ganjil), sehingga loop baru berhenti pada i = 9.
 =========================================================================
*/
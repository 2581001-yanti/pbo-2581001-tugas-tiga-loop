import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println("\n===== SATU DERET, TIGA LOOP =====");

        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
        System.out.println();

        System.out.print("while    : ");
        int w = 1;
        while (w <= n) System.out.print(w++ + " ");
        System.out.println();

        System.out.print("do-while : ");
        int dw = 1;
        do { System.out.print(dw++ + " "); } while (dw <= n);
        System.out.println("\n");

        int kurang = 0, kurangSama = 0;
        for (int i = 1; i < n; i++) kurang++;
        for (int i = 1; i <= n; i++) kurangSama++;

        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        System.out.print("Disaring : ");
        int cetakCount = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            if (i > 7) break;
            System.out.print(i + " ");
            cetakCount++;
        }
        System.out.println("\nSampai println  : " + cetakCount + " kali");

        input.close();
    }
}

/*
 =========================================================================
 KELUARAN SAAT RUN 1 (n = 5):
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
 1. Kenapa do-while mencetak "1" saat n = 0?
    Karena do-while mengeksekusi blok kode minimal sekali sebelum mengecek syarat.

 2. Kenapa tidak berhenti di i = 8?
    Saat i = 8 (genap), perintah continue dieksekusi lebih dulu sehingga perintah break terlewati.
    Loop baru memeriksa break dan terhenti saat i = 9 (ganjil).
 =========================================================================
*/
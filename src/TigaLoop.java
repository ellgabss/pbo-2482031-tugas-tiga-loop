import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            if (i > 1) System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();

        System.out.print("while    : ");
        int j = 1;
        while (j <= n) {
            if (j > 1) System.out.print(" ");
            System.out.print(j);
            j++;
        }
        System.out.println();

        // do-while mengecek kondisinya sesudah badan loop dijalankan, jadi badannya pasti jalan minimal sekali
        System.out.print("do-while : ");
        int k = 1;
        do {
            if (k > 1) System.out.print(" ");
            System.out.print(k);
            k++;
        } while (k <= n);
        System.out.println();

        // Hasil jalan pertama, n = 5:
        // Batas deret (n) : 5
        //
        // ===== SATU DERET, TIGA LOOP =====
        // for      : 1 2 3 4 5
        // while    : 1 2 3 4 5
        // do-while : 1 2 3 4 5
        //
        // Hasil jalan kedua, n = 0:
        // Batas deret (n) : 0
        //
        // ===== SATU DERET, TIGA LOOP =====
        // for      :
        // while    :
        // do-while : 1
        //
        // for dan while memakai kondisi (i <= n) yang dicek SEBELUM badan loop, jadi begitu n = 0
        // syaratnya langsung gagal dan badannya tidak pernah jalan -> baris kosong.
        // do-while mencetak k = 1 lebih dulu, baru mengecek (k <= n) SESUDAHNYA, jadi badannya
        // pasti jalan minimal sekali walau n = 0 -> baris ketiga berisi 1.
        // Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan, jadi badannya
        // pasti jalan minimal sekali.

        System.out.println();

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

        input.close();
    }
}
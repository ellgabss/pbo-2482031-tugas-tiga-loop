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

        input.close();
    }
}
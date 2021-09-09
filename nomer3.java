import java.util.Scanner;
public class nomer3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

	System.out.println("114,120,279,173,296,407,190,273,549"); 
        System.out.print("Cari bilangan :");
        int bilangan = scan.nextInt();

        int n = 0;
        int[] binary = { 114,120,279,173,296,407,190,273,549 };
        int binaryLength = binary.length;

        for (int x : binary) { 
            if (bilangan == x) {
                System.out.println("Bilangan tersebut berada pada indeks ke-" + n);
                break;
            }
            n++;
        }

        if (n == binaryLength) {
            System.out.println("Bilangan tersebut tidak tertera");
        }
    }
}
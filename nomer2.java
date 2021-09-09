import java.util.Scanner;
class nomer2 {
  public static void main(String args[])
  {
    int num;
    System.out.println("Masukkan sebuah bilangan :");

    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    if ( num % 2 == 0 )
        System.out.println("Bilangan genap");
     else
        System.out.println("Bilangan ganjil");
  }
}
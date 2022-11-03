import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, total = 0;
        System.out.print("Lütfen Sayı Giriniz : ");
        sayi = input.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                total += i;
            }
        }
        String result = (sayi == total)? sayi + " mükemmel sayıdır! ": sayi + " mükemmel sayı değildir!";
        System.out.println(result);
    }
}
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Scanner is involved to Take in all the numbers

    System.out.println("How many cookies where there?");
    int pastJar = scan.nextInt();
    System.out.println("How many cookies are there now?");
    int currentJar = scan.nextInt();

    int amount = cookieAmount(pastJar, currentJar);
    System.out.println(owe(amount));
  }

  static int cookieAmount(int pastJar, int currentJar) {
    int amount = pastJar - currentJar;
    return amount;
    // The subtraction is to get the total amout of cookies left
  }

  static String owe(int value) {
    String now = "now you owe me, " + value + " cookies";
    return now;
  }
}
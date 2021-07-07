import java.util.Scanner;

public class FibonnaciZahl {

  public static long fibonnaciRecursive(long n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonnaciRecursive(n - 1) + fibonnaciRecursive(n - 2);
  }

  public static long fibonnaciIterative(long n) {
    int vorvorherigeNummer = 0;
    int vorherigeNummer = 0;
    int currentNummer = 1;
    for (int i = 1; i < n; i++) {
      vorvorherigeNummer = vorherigeNummer;
      vorherigeNummer = currentNummer;
      currentNummer = vorvorherigeNummer + vorherigeNummer;
    }
    return currentNummer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Geben Sie eine Zahl ein: ");
    long n = in.nextLong();
    in.close();

    // Recursive
    long zeitpunktStart_recursive = System.nanoTime();
    long result_recursive = fibonnaciRecursive(n);
    long zeitpunktEnde_recursive = System.nanoTime();
    long dauer_recursive = zeitpunktEnde_recursive - zeitpunktStart_recursive;
    System.out.println("Die Dauer Recursive: " + dauer_recursive + " Result: " + result_recursive);

    // Iteration
    long zeitpunktStart_iterative = System.nanoTime();
    long result_iterative = fibonnaciIterative(n);
    long zeitpunktEnde_iterative = System.nanoTime();
    long dauer_iterative = zeitpunktEnde_iterative - zeitpunktStart_iterative;
    System.out.println("Die Dauer Iterative: " + dauer_iterative + " Result: " + result_iterative);
  }
}

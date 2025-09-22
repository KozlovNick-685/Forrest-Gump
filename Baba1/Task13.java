import java.util.Scanner;

public class Task13{
  public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    int a = 0;
    int b = myScanner.nextInt();
    while (b >= a){
      a = b;
      b = myScanner.nextInt();
    }
  }
}

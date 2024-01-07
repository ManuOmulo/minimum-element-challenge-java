import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(readIntegers()));
  }

  public static int[] readIntegers() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter list of numbers separated by commas: ");
    String input = sc.nextLine();
    String[] formattedString = input.split(",");
    int[] newIntArray = new int[formattedString.length];

    for (int i = 0; i < newIntArray.length; i++) {
      newIntArray[i] = Integer.parseInt(formattedString[i]);
    }

    return newIntArray;
  }
}

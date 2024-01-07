import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] arr = readIntegers();
    System.out.println(Arrays.toString(arr));
    int minValue = findMin(arr);
    System.out.println("min value in array is: " + minValue);

    System.out.println(Arrays.toString(reverse(arr)));
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

  public static int findMin(int[] array) {
    int min = array[0];

    for (int number : array) {
      if (number < min) {
        min = number;
      }
    }

    return min;
  }

  private static int[] reverse(int[] array) {
    int[] reversedArray = Arrays.copyOf(array, array.length);
    int maxIndex = reversedArray.length - 1;
    int halfLength = reversedArray.length / 2;

    for (int i = 0; i < halfLength; i++) {
      int temp = reversedArray[i];
      reversedArray[i] = reversedArray[maxIndex - i];
      reversedArray[maxIndex - i] = temp;
    }

//    for (int i = 0; i < reversedArray.length; i++) {
//      for (int j = 1; j < reversedArray.length; j++) {
//        if (j > i) {
//          int temp = reversedArray[i];
//          reversedArray[i] = reversedArray[j];
//          reversedArray[j] = temp;
//        }
//      }
//    }

    return reversedArray;
  }
}

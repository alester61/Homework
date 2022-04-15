import java.util.Arrays;

public class HomeWorkL3 {
    public static void main(String[] args) {
        System.out.println("HomeWork pt.1");
        partOne();
        System.out.println("HomeWork pt.2");
        partTwo();
        System.out.println("HomeWork pt.3");
        partThree();
        System.out.println("HomeWork pt.4");
        partFour();
        System.out.println("HomeWork pt.5");
        int[] input = partFive(2, 8);
        System.out.println(Arrays.toString(input));



    }

    private static void partOne() {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void partTwo() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void partThree() {
        int[] sixArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < sixArr.length;  i++) {
            if (sixArr[i] < 6) {
                sixArr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(sixArr));
    }

    private static int[][] partFour() {
        int[][] diagonalArr = new int[7][7];
        for (int i = 0; i < 7; i++) {
            diagonalArr[i][i] = 1;
            diagonalArr[i][diagonalArr.length - i - 1] = 1;
        }
        Arrays.stream(diagonalArr).map(Arrays::toString).forEach(System.out::println);

//        System.out.println(Arrays.deepToString(diagonalArr)); не смог разобраться как сделать с новой строчки/
        return diagonalArr;
    }
    private static int[] partFive(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}

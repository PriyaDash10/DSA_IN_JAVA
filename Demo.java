import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n, sum = 0, avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        avg = sum / n;
        System.out.println("Average of array elements = " + avg);
        sc.close();
    }
}

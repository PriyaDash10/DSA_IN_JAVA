import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int[] a = {4, 5, 2, 10, 8};
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && s.peek() >= a[i]) {
                s.pop();
            }

            if (s.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(s.peek() + " ");

            s.push(a[i]);
        }
    }
}

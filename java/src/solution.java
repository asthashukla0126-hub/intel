// cook your dish here
import java.util.*;
class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            double avg = (A + B) / 2;
            if (avg > C)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

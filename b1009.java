import java.util.Scanner;

public class b1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] stringNumberArray;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r = 1;

            for (int j = 0; j < b; j++) {
                r = a * r % 10;
                if (r == 0) {
                    r = 10;
                }
            }
            System.out.println(r);
        }
    }
}


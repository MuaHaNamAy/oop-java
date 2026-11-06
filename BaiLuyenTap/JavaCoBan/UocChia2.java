import java.util.Scanner;

public class UocChia2 {
    public static void main(String[] args) {
        Scanner Uc = new Scanner(System.in);
        int n = Uc.nextInt();
        for (int i = 1; i <= n; i++) {
            long a = Uc.nextLong();
            int kqua = 0;

            for (long j = 1; j * j <= a; j++) {
                if (a % j == 0) {
                    if (j % 2 == 0) {
                        kqua++;
                    }
                    long k = a / j; // uoc con lai trong cap
                    if (k != j && k % 2 == 0) {
                        kqua++;
                    }
                }
            }

            System.out.println(kqua);
        }
        Uc.close();
    }
}

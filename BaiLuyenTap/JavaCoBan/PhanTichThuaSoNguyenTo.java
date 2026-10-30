import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            long n = sc.nextLong();
            StringBuilder sb = new StringBuilder();
            sb.append("Test ").append(tc).append(": ");

            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    int cnt = 0;
                    while (n % i == 0) {
                        n /= i;
                        cnt++;
                    }
                    sb.append(i).append("(").append(cnt).append(") ");
                }
            }
            if (n > 1) {
                sb.append(n).append("(1) ");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
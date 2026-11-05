import java.util.scanner;
public class BoiSo {
    public static void main(String[] args) {
        Scanner bs = new Scanner(System.in);
        int n = bs.nextInt();
        for (int i = 1; i <= n; i++) {
            long a = bs.nextLong();
            long b = bs.nextLong();
            long x = a;
            long y = b;
            while (y != 0) {
                long temp = y;
                y = x % y;
                x = temp;
            }
            long kqua = x;
            long lcm = (a * b) / kqua;
            System.out.println(lcm + " " + kqua);

        }
        bs.close();
    }
}
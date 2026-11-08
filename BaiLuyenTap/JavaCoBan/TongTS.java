import java.io.*;

public class TongTS {
    public static void main(String[] args) throws IOException {
        final int MAX = 2000000;
        int[] spf = new int[MAX + 1];
        for (int i = 2; i <= MAX; i++) {
            if (spf[i] == 0) { 
                for (int j = i; j <= MAX; j += i) {
                    if (spf[j] == 0) {
                        spf[j] = i;
                    }
                }
            }
        }
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int n = (int) st.nval;

        long tong0 = 0;
        for (int i = 0; i < n; i++) {
            st.nextToken();
            int a = (int) st.nval;
            while (a > 1) {
                tong0 += spf[a];
                a /= spf[a];
            }
        }
        System.out.println(tong0);
    }
}

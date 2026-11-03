import java.util.Scanner;

public class CatDoi {
    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);
        int n = cd.nextInt();
        for (int i = 1; i <= n; i++) {
            String a = cd.next();
            String kqua = "";
            boolean hopLe = true;

            for (int j = 0; j < a.length(); j++) {
                char c = a.charAt(j);
                if (c == '0' || c == '8' || c == '9') {
                    kqua += '0';
                } else if (c == '1') {
                    kqua += '1';
                } else {
                    hopLe = false;
                    break;
                }
            }

            int k = 0;
            while (k < kqua.length() && kqua.charAt(k) == '0') {
                k++;
            }
            kqua = kqua.substring(k);

            if (!hopLe || kqua.isEmpty()) {
                System.out.println("INVALID");
            } else {
                System.out.println(kqua);
            }
        }
        cd.close();
    }
}

import java.util.Scanner;
public class DoiXung {
    static boolean DoiXung(String a) {
        int l = 0, r = a.length() - 1;
        while (l < r) {
            if (a.charAt(l) != a.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void mai(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (DoiXung(a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
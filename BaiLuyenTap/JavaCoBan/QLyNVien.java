public class QLyNVien {
    String name;
    int old;
    QLyNVien(String name, int old) {
        this.name = name;
        this.old = old;
    }
    long Luong() {
        return 0;
    }
}
class OfficeEmployee extends QLyNVien {
    public static final int LuongO = 100;
    int soNgayLamViec;
    OfficeEmployee(String name, int old, int soNgayLamViec) {
        super(name, old);
        this.soNgayLamViec = soNgayLamViec;
    }
    @Override
    long Luong() {
        return soNgayLamViec * LuongO;
    }
}
class TechEmployee extends QLyNVien {
    int SoGioLamViec;
    int LuongTheoGio;
    TechEmployee(String name, int old, int SoGioLamViec, int LuongTheoGio) {
        super(name, old);
        this.SoGioLamViec = SoGioLamViec;
        this.LuongTheoGio = LuongTheoGio;
    }
    @Override 
    long Luong() {
        return (long) SoGioLamViec * LuongTheoGio;
    }
}
class Main {
    public static void main(String[] args) {
        QLyNVien[] c = new QLyNVien[2];
        c[0] = new OfficeEmployee("Nguyen Van A", 30, 20);
        c[1] = new TechEmployee("Nguyen Van B", 25, 100, 50);
        for (QLyNVien employee : c) {
            System.out.println("Name: " + employee.name);
            System.out.println("Old: " + employee.old);
            System.out.println("Luong: " + employee.Luong());
        }
    }
}
import java.util.Scanner;

public class GiangVienThinhGiang extends  GiangVien{

    public GiangVienThinhGiang() {

    }
    public GiangVienThinhGiang(String tenGiangVien, String email, String address, int numberPhone, int soGioDay, String coQuan) {
        super(tenGiangVien, email, address, numberPhone);
        this.soGioDay = soGioDay;
        this.coQuan = coQuan;
    }

    private int soGioDay;
    private String coQuan;

    public void inputGVTG() {
        super.inputGV();
        Scanner input = new Scanner(System.in);
        System.out.println("Số giờ dạy : ");
        this.soGioDay = input.nextInt();

        input = new Scanner(System.in);
        System.out.println("Cơ quan : ");
        this.coQuan = input.nextLine();
    }
    public String toString() {
        super.toString();
        String giangVienThinhGiang = "Số giờ dạy : " + this.soGioDay + ", Cơ quan: " + this.coQuan;
        return super.toString() + " " + giangVienThinhGiang;
    }
    public int luong() {
        int luongTG = this.soGioDay * 200000;
        return luongTG;
    }
}

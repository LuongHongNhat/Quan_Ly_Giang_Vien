import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GiangVien {
    private String tenGiangVien;
    private String email;
    private String address;
    private int numberPhone;

    public GiangVien() {

    }
    public GiangVien(String tenGiangVien, String email, String address, int numberPhone) {
        this.tenGiangVien = tenGiangVien;
        this.email = email;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public void inputGV() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tên giảng viên : ");
        this.tenGiangVien = input.nextLine();

        System.out.println("Email : ");
        this.email = input.nextLine();

        System.out.println("Address : ");
        this.address = input.nextLine();

        System.out.println("Number phone : ");
        this.numberPhone = input.nextInt();
    }
    public String toString() {
        String giangVien = "Họ & tên : " + this.tenGiangVien + ", Email: " + this.email +
                ", Address: " + this.address + ", Number phone: " + this.numberPhone;
        return giangVien;
    }

    public int luong() {
        return 0;
    }
}

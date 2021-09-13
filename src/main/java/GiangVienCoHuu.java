import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien{
    private int luongCoDinh;
    private int luongNgoaiGio;
    private int gioTangCa;

    public GiangVienCoHuu() {

    }
    public GiangVienCoHuu(String tenGiangVien, String email, String address, int numberPhone, int luongCoDinh, int luongNgoaiGio, int gioTangCa) {
        super(tenGiangVien, email, address, numberPhone);
        this.luongCoDinh = luongCoDinh;
        this.luongNgoaiGio = luongNgoaiGio;
        this.gioTangCa = gioTangCa;
    }

    public void inputGVCH() {
        super.inputGV();
        Scanner input = new Scanner(System.in);
        System.out.println("Lương cố định : ");
        this.luongCoDinh = input.nextInt();

        System.out.println("Lương ngoài giờ : ");
        this.luongNgoaiGio = input.nextInt();

        System.out.println("Số giờ tăng ca : ");
        this.gioTangCa = input.nextInt();
    }

    public String toString() {
        super.toString();
        String giangVienCoHuu = "Lương cố định : " + this.luongCoDinh + ", Lương ngoài giờ: " + this.luongNgoaiGio +
                ", Số giờ tăng ca: " + this.gioTangCa;
        return super.toString() + " " + giangVienCoHuu;
    }

    public int luong() {
        int luongCH;
        if (gioTangCa > 0){
            luongCH = this.luongCoDinh + (this.gioTangCa * this.luongNgoaiGio);
        }else{
            luongCH = this.luongCoDinh;
        }
        return luongCH;
    }
}

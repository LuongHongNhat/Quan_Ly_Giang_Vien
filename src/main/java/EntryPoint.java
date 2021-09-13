import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {

        int numOfGiaoVien;
        String typeOfTeacher;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teacher:");
        numOfGiaoVien = sc.nextInt();

        ArrayList<GiangVien> listOfTeacher = new ArrayList<>();
        for (int i = 0; i < numOfGiaoVien; i++) {
            sc = new Scanner(System.in);
            System.out.println("Type of teacher (TG or CH) :");
            typeOfTeacher = sc.nextLine();

            if (typeOfTeacher.equals("TG")){
                GiangVienThinhGiang new_GVTG = new GiangVienThinhGiang();
                new_GVTG.inputGVTG();
                listOfTeacher.add(new_GVTG);
            }else if (typeOfTeacher.equals("CH")){
                GiangVienCoHuu new_GVCH = new GiangVienCoHuu();
                new_GVCH.inputGVCH();
                listOfTeacher.add(new_GVCH);
            }else{
                System.out.println("Loại giáo viên không hợp lệ");
            }

        }

        for (int i = 0; i < listOfTeacher.size(); i++) {
            System.out.println("Thông tin giáo viên thứ " + (i +1) +"\n "+listOfTeacher.get(i).toString());
        }
        int tongLuongCuaGiaoVien = 0;
        for (int i = 0; i < listOfTeacher.size(); i++) {
            tongLuongCuaGiaoVien += listOfTeacher.get(i).luong();
        }
        System.out.println("Lương của tất cả giáo viên là " + tongLuongCuaGiaoVien );

    }

}

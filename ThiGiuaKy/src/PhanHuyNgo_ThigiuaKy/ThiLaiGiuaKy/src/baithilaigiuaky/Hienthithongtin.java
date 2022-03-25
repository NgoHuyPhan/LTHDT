package baithilaigiuaky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hienthithongtin {
    List<Thongtinconnguoi> thongTinConNguoi = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public Hienthithongtin(){

    }
    public void themThongTin(Thongtinconnguoi thongtinconnguoi) {
        thongTinConNguoi.add(thongtinconnguoi);
    
    }
    public Thongtinconnguoi nhapThongTin(){
        Thongtinconnguoi  thongtinconnguoi = null;
        System.out.println(" Nhập tên: ");
        String ten = sc.nextLine();
        System.out.println(" Nhập Địa Chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println(" Muốn nhập thông tin của [1 Sinh Viên] [2 Nhân Viên] [3 Khách Hàng]");
        int chon = sc.nextInt();
        if(chon ==1 ){
            System.out.println(" Nhập điểm 1: ");
            double dMH1 = sc.nextDouble();
            System.out.println(" Nhập điểm 2: ");
            double dMH2 = sc.nextDouble();
            thongtinconnguoi = new SinhVien(ten, diaChi, dMH1, dMH2);
        }
        if(chon ==2 ){
            System.out.println(" Nhập Lương: ");
            double luong = sc.nextDouble();
            System.out.println(" Nhập Chức Vụ: ");
            String chucVu = sc.nextLine();
            thongtinconnguoi = new NhanVien(ten, diaChi, luong, chucVu);
        }
        if(chon ==3) {
            System.out.println(" Nhập Kiểu Xe: ");
            String kieuXe = sc.nextLine();
            thongtinconnguoi = new KhachHang(ten, diaChi, kieuXe);

        }   
        else{
            System.out.println("Lựa chọn không hợp lệ!!!");
        }
        return thongtinconnguoi;
    }
    public void inThongTin(){
        for (Thongtinconnguoi thongtinconnguoi2 : thongTinConNguoi) {
            System.out.println(thongtinconnguoi2);
        }
    }
}

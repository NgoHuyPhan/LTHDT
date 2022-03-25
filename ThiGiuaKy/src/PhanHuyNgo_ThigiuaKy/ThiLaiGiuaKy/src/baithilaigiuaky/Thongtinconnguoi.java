package baithilaigiuaky;

import java.util.Scanner;

public abstract class Thongtinconnguoi {
    private String ten, diaChi;
    Scanner sc = new Scanner(System.in);
public Thongtinconnguoi(){

}
public void nhapThongTin(){
    System.out.println("Nhập Tên: ");
    this.ten = sc.nextLine();
    System.out.println("Nhập Địa Chỉ: ");
    this.diaChi = sc.nextLine();

}
public Thongtinconnguoi(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }
public String getTen() {
    return ten;
}
public void setTen(String ten) {
    this.ten = ten;
}
public String getDiaChi() {
    return diaChi;
}
public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
}
@Override
public String toString() {
    return "Thongtinconnguoi [diaChi=" + diaChi + ", ten=" + ten + "]";
}

    


    
}

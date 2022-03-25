package baithilaigiuaky;

public class KhachHang extends Thongtinconnguoi {
    private String kieuXe;
    public KhachHang(){

    }

    
    public KhachHang(String kieuXe) {
        this.kieuXe = kieuXe;
    }
    public KhachHang(String ten, String diaChi, String kieuXe) {
        super(ten, diaChi);
        this.kieuXe = kieuXe;
    }
    public String getKieuXe() {
        return kieuXe;
    }
    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
    @Override
    public String toString() {
        String khachHang = "kieuXe" + this.getKieuXe();
        return super.toString()+ khachHang; 
    }
}

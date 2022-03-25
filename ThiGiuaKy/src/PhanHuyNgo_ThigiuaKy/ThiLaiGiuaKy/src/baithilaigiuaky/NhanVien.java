package baithilaigiuaky;

public class NhanVien extends Thongtinconnguoi {
    private double luong;
    private String chucVu;
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public String getChucVu() {
        return chucVu;
    }
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    public NhanVien(){
        
    }
    public NhanVien(String ten, String diaChi, double luong, String chucVu) {
        super(ten, diaChi);
        this.luong = luong;
        this.chucVu = chucVu;
    }
    @Override
    public String toString() {
        String nhanVien = "luong chucVu" + this.getLuong() + this.getChucVu();


        
        return super.toString() + nhanVien;
    }

    
}

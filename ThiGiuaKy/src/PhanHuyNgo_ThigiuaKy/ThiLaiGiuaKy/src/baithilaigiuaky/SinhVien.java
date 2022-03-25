package baithilaigiuaky;


public class SinhVien extends Thongtinconnguoi{
    private double dMH1, dMH2;
    public SinhVien(){
        
    }
    

    public double getdMH1() {
        return dMH1;
    }

    public void setdMH1(double dMH1) {
        this.dMH1 = dMH1;
    }

    public double getdMH2() {
        return dMH2;
    }

    public void setdMH2(double dMH2) {
        this.dMH2 = dMH2;
    }

    public SinhVien(double dMH1, double dMH2) {
        this.dMH1 = dMH1;
        this.dMH2 = dMH2;
    }

    public SinhVien(String ten, String diaChi, double dMH1, double dMH2) {
        super(ten, diaChi);
        this.dMH1 = dMH1;
        this.dMH2 = dMH2;
    }

    @Override
    public String toString() {
        return "SinhVien [dMH1=" + dMH1 + ", dMH2=" + dMH2 + super.toString()
        +"]";
    }
    
    private double tinhTongDiem() {
        double diem = 0;
        diem = this.getdMH1() + this.getdMH2();
        return diem;

    }
    public void tongDiem(){
        System.out.println("Tổng điểm là: "+ this.tinhTongDiem());
    }
}

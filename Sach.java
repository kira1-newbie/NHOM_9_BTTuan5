// Tao lop sach
public abstract class Sach {
    // Thuộc tính (attributes) với tính đóng gói (private)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    // Constructor mac dinh
    public Sach() {}

    // Constructor de khoi tao sach
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Phuong thuc nhan gia tri
    public String getMaSach() {  return maSach;   }

    public String getTieuDe() {  return tieuDe;   }

    public String getTacGia() {  return tacGia;   }

    public int getNamXuatBan() { return namXuatBan;  }

    public int getSoLuong() {    return soLuong;  }
    
    public double getgiaCoBan() {    return giaCoBan;  }
    
    // Phuong thuc nhap gia tri
    public void setMaSach(String maSach) {     this.maSach = maSach;    }

    public void setTieuDe(String tieuDe) {     this.tieuDe = tieuDe;    }

    public void setTacGia(String tacGia) {     this.tacGia = tacGia;    }

    public void setNamXuatBan(int namXuatBan) {   this.namXuatBan = namXuatBan;    }

    public void setSoLuong(int soLuong) {      this.soLuong = soLuong;  }

    public void setgiaCoBan(double giaCoBan) {      this.giaCoBan = giaCoBan;  }

    // Yêu cầu 2: Phương thức hienThiThongTin()
    public void hienThiThongTin() {
        System.out.println("=====================================");
        System.out.println("THONG TIN SACH:");
        System.out.println("Ma sach: " + this.maSach);
        System.out.println("Tieu de: " + this.tieuDe);
        System.out.println("Tac gia: " + this.tacGia);
        System.out.println("Nam xuat ban: " + this.namXuatBan);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Gia ban co ban: " + this.giaCoBan);
        System.out.println("=====================================");
    }
    /*
     * 3. Ghi đè (Override) phương thức toString()
    */
    @Override
    public String toString() {
        return "Sach{" + "maSach='" + maSach + '\'' + ", tieuDe='" + tieuDe + '\'' + ", tacGia='" + tacGia + '\'' + ", namXuatBan=" + namXuatBan + ", soLuong=" + soLuong + '}';
    }
    public abstract double tinhGiaBan();
}
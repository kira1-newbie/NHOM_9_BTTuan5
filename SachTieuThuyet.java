
public class SachTieuThuyet extends Sach{
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(){ super(); }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                            String theLoai, boolean laSachSeries){ 
        // Gọi đến hàm tạo của lớp cha (Sach) để khởi tạo các thuộc tính chung
        // Từ khóa 'super' phải là câu lệnh đầu tiên trong hàm tạo của lớp con.
        super(maSach,tieuDe,tacGia,namXuatBan,soLuong,giaCoBan);
        
        // Khởi tạo các thuộc tính riêng của lớp con
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    // Các phương thức getter và setter cho thuộc tính riêng
    public void settheLoai(String theLoai){      this.theLoai = theLoai;    }
    public String gettheLoai(){        return theLoai;    }
    public void setcapDo(boolean laSachSeries){        this.laSachSeries = laSachSeries;    }
    public boolean getlaSachSeries(){        return laSachSeries;    }

    @Override
    public double tinhGiaBan()
    {
        return (super.getgiaCoBan() + (laSachSeries ? 15000 : 0));
    }

    /*
     * 3. Ghi đè (Override) phương thức toString()
     * Để hiển thị đầy đủ thông tin, bao gồm cả thông tin từ lớp cha ta dùng super.toString(),
     * sau đó thay thế dấu } cuối cùng bằng dòng lệnh nối dài.
    */
    @Override
    public String toString() {
        return super.toString().replace("}", ", theLoai = " + theLoai + ", laSachSeries = " + laSachSeries + ", GiaBan = " + tinhGiaBan() + "}");
    }
}

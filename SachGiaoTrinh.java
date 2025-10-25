
public class SachGiaoTrinh extends Sach{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(){ super(); }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                        String monHoc, String capDo){ 
        // Gọi đến hàm tạo của lớp cha (Sach) để khởi tạo các thuộc tính chung
        // Từ khóa 'super' phải là câu lệnh đầu tiên trong hàm tạo của lớp con.
        super(maSach,tieuDe,tacGia,namXuatBan,soLuong,giaCoBan);
        
        // Khởi tạo các thuộc tính riêng của lớp con
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    // Các phương thức getter và setter cho thuộc tính riêng
    public void setmonHoc(String monHoc){      this.monHoc = monHoc;    }
    public String getmonHoc(){        return monHoc;    }
    public void setcapDo(String capDo){        this.capDo = capDo;    }
    public String getcapDo(){        return capDo;    }

    @Override
    public double tinhGiaBan()
    {
        return (super.getgiaCoBan() + (2025-super.getNamXuatBan())*5000);
    }
    /*
     * 3. Ghi đè (Override) phương thức toString()
     * Để hiển thị đầy đủ thông tin, bao gồm cả thông tin từ lớp cha ta dùng super.toString(),
     * sau đó thay thế dấu } cuối cùng bằng dòng lệnh nối dài.
    */
    @Override
    public String toString() {
        return super.toString().replace("}",  ", monHoc = " + monHoc + ", capDo = " + capDo + ", GiaBan = " + tinhGiaBan() + "}");
    }
}

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {

    // Sử dụng ArrayList để lưu trữ danh sách các cuốn sách
    private List<Sach> danhSachSach;

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }

    /**
     * Tìm kiếm một cuốn sách theo mã sách.
     * maSach Mã sách cần tìm.
     * Đối tượng Sach nếu tìm thấy, ngược lại trả về null.
     */
    public Sach timKiem(String maSach) {
        // Bắt đầu duyệt qua TỪNG cuốn sách (đặt là 's') trong danh sách 'danhSachSach'.
        for (Sach s : this.danhSachSach) {

            // Với mỗi cuốn sách 's', ta lấy mã của nó ra (s.getMaSach())
            // rồi so sánh với 'maSach' mà chúng ta cần tìm.
            // .equalsIgnoreCase() sẽ so sánh không phân biệt chữ hoa hay chữ thường (ví dụ: "S01" sẽ khớp với "s01").
            if (s.getMaSach().equalsIgnoreCase(maSach)) {

                // NẾU TÌM THẤY một cuốn sách có mã khớp,
                // ngay lập tức trả về (return) cuốn sách đó và kết thúc hàm tìm kiếm.
                // Không cần phải tìm tiếp nữa.
                return s;
            }
        }

        // NẾU vòng lặp đã chạy qua TẤT CẢ các cuốn sách mà không tìm thấy mã nào khớp,
        // tức là không có sách cần tìm trong danh sách.
        // Lúc này, hàm sẽ trả về giá trị null.
        return null;
    }
    /**
     * Thêm một cuốn sách mới vào danh sách.
     * Sẽ không thêm nếu mã sách đã tồn tại.
     * sach Đối tượng sách cần thêm (có thể là Sach, SachGiaoTrinh, hoặc SachThamKhao).
     * true nếu thêm thành công, false nếu mã sách đã tồn tại.
     */
    public boolean them(Sach sach) {
        // Kiểm tra xem mã sách đã tồn tại hay chưa
        // Phương thức này nhận vào một đối tượng Sach
        // Đối tượng 'sach' đã chứa đầy đủ thông tin (mã, tiêu đề, tác giả,...)
        if (timKiem(sach.getMaSach()) != null) {
            System.out.println("Loi: Ma sach '" + sach.getMaSach() + "' da ton tai.");
            return false;
        }
        this.danhSachSach.add(sach); // Lenh add DE THEM SACH VAO DANH SACH
        return true;
    }

    /**
     * Xóa một cuốn sách khỏi danh sách dựa vào mã sách.
     * maSach Mã của cuốn sách cần xóa.
     * true nếu xóa thành công, false nếu không tìm thấy sách.
     */
    public boolean xoa(String maSach) {
        Sach sachCanXoa = timKiem(maSach);
        if (sachCanXoa != null) {
            this.danhSachSach.remove(sachCanXoa);
            return true;
        }
        return false;
    }

    /**
     * Cập nhật thông tin cho một cuốn sách.
     * maSach Mã của sách cần cập nhật.
     * soLuongMoi Năm xuất bản, Số lượng mới cần cập nhật.
     * true nếu cập nhật thành công, false nếu không tìm thấy sách.
     */
    public boolean capNhat(String maSach, int namXuatBan, int soLuongMoi) {
         Sach sachCanCapNhat = timKiem(maSach);
         if (sachCanCapNhat != null) {
            sachCanCapNhat.setNamXuatBan(namXuatBan);
            sachCanCapNhat.setSoLuong(soLuongMoi);
            return true;
         }
         return false;
    }
    /**
     * Cập nhật thông tin cho một cuốn sách.
     * maSach Mã của sách cần cập nhật.
     * maSachnew Mã sách mới cần cập nhật.
     * true nếu cập nhật thành công, false nếu không tìm thấy sách.
     */
    public boolean capNhat(String maSach, String maSachnew) {
         Sach sachCanCapNhat = timKiem(maSach);
         if (sachCanCapNhat != null) {
            sachCanCapNhat.setMaSach(maSachnew);
            return true;
         }
         return false;
    }
    
    /**
     * Hiển thị toàn bộ danh sách các cuốn sách hiện có.
     */
    public void hienThiDanhSach() {
        if (this.danhSachSach.isEmpty()) {
            System.out.println("Thu vien chua co sach nao.");
            return;
        }
        System.out.println("--- DANH SACH SACH TRONG THU VIEN ---");
        for (Sach s : this.danhSachSach) {
            // Tự động gọi phương thức toString() tương ứng của mỗi đối tượng
            System.out.println(s);
        }
    }
}
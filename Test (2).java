

/**
 * Lớp Test chứa hàm main để chạy chương trình quản lý sách.
 * Tại đây, chúng ta sẽ tạo đối tượng QuanLySach và gọi các chức năng của nó.
 */
public class Test {

    public static void main(String[] args) {
        // 1. Tạo đối tượng quản lý sách
        // Đây là "trái tim" của chương trình, nơi lưu trữ và xử lý mọi thứ.
        QuanLySach quanLy = new QuanLySach();
        System.out.println("Chuong trinh quan ly thu vien da khoi dong.");

        // 2. THÊM MỚI: Tạo và thêm các đối tượng sách vào danh sách
        System.out.println("\n## THUC HIEN CHUC NANG THEM SACH ##"); 
        quanLy.them(new SachGiaoTrinh("SGT01", "Toan cao cap A1", "Nguyen Van A", 2022, 50,40000, "Toan hoc", "Dai hoc"));
        quanLy.them(new SachTieuThuyet("STT01", "Tri tue nhan tao 1", "Jane Smith", 2023, 30,60000, "Trinh tham", true));
        quanLy.them(new SachGiaoTrinh("SGT02", "Vat ly dai cuong 1", "Tran B", 2019, 100,45000, "Vat ly", "Dai hoc"));
        quanLy.them(new SachGiaoTrinh("SGT03", "Vat ly dai cuong 2", "Tran B", 2021, 100,40000, "Vat ly", "Dai hoc"));
        quanLy.them(new SachTieuThuyet("STT02", "Bo gia", "Mario Puzo", 2020, 30,60000, "Trinh tham", false));

        // 3. HIỂN THỊ: In toàn bộ danh sách sách hiện có
        System.out.println("\n## THUC HIEN CHUC NANG HIEN THI DANH SACH ##");
        quanLy.hienThiDanhSach();

        // 4. TÌM KIẾM: Tìm một cuốn sách cụ thể theo mã sách
        System.out.println("\n## THUC HIEN CHUC NANG TIM KIEM SACH 'SGT02' ##");
        Sach sachTimDuoc = quanLy.timKiem("SGT02");
        if (sachTimDuoc != null) {
            System.out.println(" -> Tim thay: " + sachTimDuoc);
        } else {
            System.out.println(" -> Khong tim thay sach co ma 'SGT02'.");
        }

        // 5. CẬP NHẬT: Thay đổi nam xuat ban, số lượng của một cuốn sách
        System.out.println("\n## THUC HIEN CHUC NANG CAP NHAT NAM XUAT BAN THANH 2024, SO LUONG SACH 'SGT01' THANH 75 ##");
        boolean capNhatThanhCong = quanLy.capNhat("SGT01", 2024, 75);
        if (capNhatThanhCong) {
            System.out.println(" -> Cap nhat thanh cong. Danh sach sau khi cap nhat:");
            quanLy.hienThiDanhSach();
        } else {
            System.out.println(" -> Cap nhat that bai, khong tim thay sach.");
        }

        // 6. CẬP NHẬT: Thay đổi maSach của một cuốn sách
        System.out.println("\n## THUC HIEN CHUC NANG CAP NHAT MA SACH TU 'SGT01' THANH 'SGT001' ##");
        boolean capNhatMAsACH = quanLy.capNhat("SGT01", "SGT001");
        if (capNhatMAsACH) {
            System.out.println(" -> Cap nhat thanh cong. Danh sach sau khi cap nhat:");
            quanLy.hienThiDanhSach();
        } else {
            System.out.println(" -> Cap nhat that bai, khong tim thay sach.");
        }

        // 6. XÓA: Xóa một cuốn sách khỏi danh sách
        System.out.println("\n## THUC HIEN CHUC NANG XOA SACH 'SGT02' ##");
        boolean xoaThanhCong = quanLy.xoa("SGT02");
        if (xoaThanhCong) {
            System.out.println(" -> Xoa thanh cong. Danh sach cuoi cung:");
            quanLy.hienThiDanhSach();
        } else {
            System.out.println(" -> Xoa that bai, khong tim thay sach.");
        }
    }
}
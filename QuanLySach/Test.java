import java.util.Scanner;

public abstract class Test implements IQuanLySach {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
		IQuanLySach BM = new BookManager();
		int x;
		int spt;
		System.out.println("Nhap so luong sach: ");
		spt = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < spt; i++) {
			Book s;
			int a;
			System.out.println("Nhap loai sach: 1.Novel 2.TextBook ");
			a = sc.nextInt();
			sc.nextLine();
			if (a == 1) {
				s = new Novel();
				s.Nhap();
				BM.themMoi(s);
			} else if (a == 2) {
				s = new TextBook();
				s.Nhap();
				BM.themMoi(s);
			}
		}
		System.out.println("DANH SACH SACH VUA NHAP:");
		BM.displayBooks();
		do {
			System.out.println("---------------------MENU---------------------");
			System.out.println("1:Them moi ");
			System.out.println("2: Xoa");
			System.out.println("3: Cap nhat");
			System.out.println("4: Tim kiem");
			System.out.println("5: Xuat danh sach");
			System.out.println("6: Kiem tra ton kho theo ma");
			System.out.println("7: Cap nhat vi tri theo ma");
			System.out.println("8: Tinh tong tien");
			System.out.println("0: Thoat!");
			x = sc.nextInt();
			sc.nextLine();
			switch (x) {
			case 1: {
				Book s;
				int a;
				System.out.println("Nhap loai sach: 1.Novel 2.TextBook ");
				a = sc.nextInt();
				sc.nextLine();
				if (a == 1) {
					s = new Novel();
					s.Nhap();
					BM.themMoi(s);
				} else if (a == 2) {
					s = new TextBook();
					s.Nhap();
					BM.themMoi(s);
				}
				break;
			}
			case 2: {
				String ma;
				System.out.println("Nhap ma can xoa: ");
				ma = sc.nextLine();
				BM.Xoa(ma);
				break;
			}
			case 3: {
				String ma;
				System.out.println("Nhap ma can cap nhat ");
				ma = sc.nextLine();
				BM.CapNhat(ma);
				break;
			}
			case 4: {
				String ma;
				System.out.println("Nhap ma can tim kiem: ");
				ma = sc.nextLine();
				if (BM.Timkiem(ma) == true)
					System.out.println("Tim thay!");
				else
					System.out.println("Khong tim thay!");
				break;
			}
			case 5: {
				BM.displayBooks();
				break;
			}
			case 6: {
				System.out.print("Nhap ma sach: ");
				String ma = sc.nextLine();
				System.out.print("Nhap so luong toi thieu: ");
				int soLuongToiThieu = sc.nextInt();
				if (BM.kiemTraTonKho(ma, soLuongToiThieu)) {
					System.out.println("Sach con du ton kho.");
				} else {
					System.out.println("Sach khong du ton kho.");
				}
				break;
			}
			case 7: {
				System.out.print("Nhap ma sach: ");
				String ma = sc.nextLine();
				System.out.print("Nhap vi tri moi: ");
				String vitri = sc.nextLine();
				BM.capNhatViTri(ma, vitri);
				break;
			}
			case 8: {
				System.out.println("Tong tien: " + BM.tinhTongTien());
			}
			case 0: {
				break;
			}
			default: {
				System.out.println("Nhap sai cu phap, vui long nhap lai!");
			}
			}
		} while (x != 0);
		sc.close();
	}
	}
}

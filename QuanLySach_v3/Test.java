import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookManager BM=new BookManager();
		int x;
		do
		{
			System.out.println("1:Thêm mới ");
			System.out.println("2: Xoá");
			System.out.println("3: Cập nhật");
			System.out.println("4: Tìm kiếm");
			System.out.println("5: Xuất danh sách");
			System.out.println("0: Thoát!");
			x=sc.nextInt();
			sc.nextLine();
			switch(x)
			{
			case 1:
			{
				Book s;
				int a;
				System.out.println("Nhap loai sach: 1.Novel 2.TextBook ");
				a=sc.nextInt();
				sc.nextLine();
				if(a==1)
				{
					s= new Novel();
					s.Nhap();
					BM.themMoi(s);
				}
				else if(a==2)
				{
					s= new TextBook();
					s.Nhap();
					BM.themMoi(s);
				}
				break;
			}
			case 2:
			{
				String ma;
				System.out.println("Nhập mã cần xóa: ");
				ma=sc.nextLine();
				BM.Xoa(ma);
				break;
			}
			case 3:
			{
				String ma;
				System.out.println("Nhập mã cần cập nhật ");
				ma=sc.nextLine();
				BM.CapNhat(ma);
				break;
			}
			case 4:
			{
				String ma;
				System.out.println("Nhập mã cần tìm kiếm ");
				ma=sc.nextLine();
				if(BM.Timkiem(ma)==true)
					System.out.println("Tìm thấy!");
				else System.out.println("Không tìm thấy!");
				break;
			}
			case 5:
			{
				BM.displayBook();
				break;
			}
			case 0:
			{
				break;
			}
			default:
			{	
				System.out.println("Nhập sai cú pháp! Vui lòng nhập lại");
			}
			}
		}
		while(x!=0);
		sc.close();
	}
}

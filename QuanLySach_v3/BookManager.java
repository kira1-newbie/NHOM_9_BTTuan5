import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BookManager {
	private List<Book> ds=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void themMoi(Book s) {
	    for (Book c : ds) {
	        if (c.equals(s)) {
	            System.out.println("Nhập trùng mã sách!");
	        return;
	        }
	    }
	    ds.add(s);
	    System.out.println("Thêm thành công!");
	}
	public void Xoa(String ma)
	{
		if(ds.isEmpty()==true)
		{
			System.out.println("Danh sách rỗng, không thể xóa!");
		}
		else
		{
		for(Book c : ds)
		{
			if(c.getBookID().equals(ma))
			{
				ds.remove(c);
				System.out.println("Xóa thành công!");
				return;
			}
		}
		System.out.println("Xóa không được!");
		}
	}
	public void CapNhat(String ma)
	{
		if(ds.isEmpty()==true)
		{
			System.out.println("Danh sách rỗng, không thể cập nhật!");
		}
		else
		for(int i=0;i<ds.size();i++)
		{
			Book c=ds.get(i);
			if(c.getBookID().equals(ma))
			{
				if(c instanceof Novel)
				{
					Book n=new Novel();
					n.Nhap();
					ds.set(i, n);
				}
					else if(c instanceof TextBook)
				{
					Book n=new TextBook();
					n.Nhap();
					ds.set(i, n);
				}
				System.out.println("Cập nhật thành công!");
				return;
			}
		}
	}
	public boolean Timkiem(String ma)
	{
		if(ds.isEmpty()==true)
		{
			System.out.println("Danh sách rỗng, không thể tìm kiếm!");
		}
		else
		for(Book c : ds)
		{
			if(c.getBookID().equals(ma))
			{
				return true;
			}
		}
		return false;
	}
	public void displayBook()
	{
		System.out.println("List Book");
		for(Book c:ds)
		{
			System.out.println(c.toString());
		}
	}
}

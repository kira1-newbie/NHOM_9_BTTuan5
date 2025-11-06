import java.util.Scanner;
public class Publisher {
    private String publisherID;
    private String ten;
    private String sdt;
    private String diaChi;
    private String email;
    private Scanner sc = new Scanner(System.in);
    public void Nhap() {
		System.out.println("===Nhap thong tin nha xuat ban===");
        do {
            System.out.print("Nhap ID nha xuat ban: ");
            publisherID = sc.nextLine();
            if (publisherID.isEmpty()) {
                System.out.println("ID khong duoc de trong!");
            }
        } while (publisherID.isEmpty());
        do {
            System.out.print("Nhap ten nha xuat ban: ");
            ten = sc.nextLine();
            if (ten.isEmpty()) {
                System.out.println("Ten khong duoc de trong!");
            }
        } while (ten.isEmpty());
        do {
            System.out.print("Nhap SDT nha xuat ban: ");
            sdt = sc.nextLine();
            if (!sdt.matches("0\\d{9,10}")) {
                System.out.println("SDT phai bat dau bang so 0 va co 10-11 chu so!");
            }
        } while (!sdt.matches("0\\d{9,10}"));
        do {
            System.out.print("Nhap dia chi nha xuat ban: ");
            diaChi = sc.nextLine();
            if (diaChi.isEmpty()) {
                System.out.println("Dia chi khong duoc de trong!");
            }
        } while (diaChi.isEmpty());
        do {
            System.out.print("Nhap email nha xuat ban: ");
            email = sc.nextLine();
            if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                System.out.println("Email khong hop le! (Vi du: example@gmail.com)");
            }
        } while (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"));
    }
@Override
public String toString() {
    return "\nNHA XUAT BAN \n  Ma NXB  : " 
		 + publisherID
         + "\n  Ten NXB : " + ten
         + "\n  SDT     : " + sdt
         + "\n  Dia chi : " + diaChi
         + "\n  Email   : " + email;
}
    public String getPublisherID() {
        return publisherID;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getEmail() {
        return email;
    }
}

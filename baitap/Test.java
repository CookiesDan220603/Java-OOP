import java.util.*;
public class Test {
    public static void main(String[] args) {
        ArrayList<NhanVien> NhanVien1 = new ArrayList<NhanVien>();
        NhanVien1.add(new NVCongNhat("10001", "Nguyen Thai Khoi", "Nam", "00/00/2003","Tra Vinh"));
        NhanVien1.add(new NVSanXuat("10002", "Truong Thai Dan Huy", "Nam", "22/06/2003","Dong Thap"));
        NhanVien1.add(new NVCongNhat("10003", "vo Thanh Trung", "Nam", "00/00/2003","Quy Nhon"));
        NhanVien1.add(new NVSanXuat("1000", "Dang Viet Trung", "Nam", "23/10/2013","Dak Lak"));
        NhanVien1.add(new NVSanXuat("10004", "Pham Phuc Xuyen", "Nam", "27/10/1960","An Giang"));
        NhanVien1.add(new NVSanXuat("10006", "Mai Xuan Ha", "Nam", "27/10/2003","Hong Nho"));
        NhanVien1.add(new NVCongNhat("10007", "Truong Thanh Huy", "Nam", "00/00/2003","Thanh Hoa"));
        NhanVien1.add(new NVCongNhat("10008", "Kieu Ngoc Nhu Huynh", "Nu", "00/00/2015","Vinh Long"));
        NhanVien1.add(new NVSanXuat("100009", "Nguyen Thi My Han", "Nu", "00/00/2003","An Giang"));
        NhanVien1.add(new NVCongNhat("10010", "Vo Dat Cong Khanh", "Nam", "00/00/2003","An Giang"));

    }
}

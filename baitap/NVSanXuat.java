public class NVSanXuat extends NhanVien {
    public NVSanXuat (String maNV, String tenNV, String gioiTinh, String ngaySinh, String diaChi){
        super(maNV, tenNV, gioiTinh, ngaySinh, diaChi);
    }
    public double LuongNV (int SoLuong){
        return SoLuong*20000;
    }
    @Override
    public String toString(){
        return tenNV +" ," + maNV + " ," + gioiTinh + " ," + ngaySinh;
    }
}

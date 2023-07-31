public class NVCongNhat extends NhanVien {
    public NVCongNhat (String maNV, String tenNV, String gioiTinh, String ngaySinh, String diaChi){
        super(maNV, tenNV, gioiTinh, ngaySinh, diaChi);
    }
    public double LuongNV (int SoNgay){
        return SoNgay*300000;
    }
    @Override
    public String toString(){
        return tenNV +" ," + maNV + " ," + gioiTinh + " ," + ngaySinh;
    }
}

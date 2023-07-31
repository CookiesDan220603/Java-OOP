public class NhanVien{
    protected String maNV;
    protected String tenNV;
    protected String gioiTinh;
    protected String ngaySinh;
    protected String  diaChi;
    public NhanVien (String maNV, String tenNV, String gioiTinh, String ngaySinh, String diaChi){
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh= ngaySinh;
        this.diaChi = diaChi;
    }
    public String getName(){
        return tenNV;
    }
    public String getDate(){
        return ngaySinh;
    }
    public void setName(String tenNV){
        this.tenNV = tenNV;
    }
    public void setDate(String ngaySinh){
        this.ngaySinh = ngaySinh;
    }
    @Override
    public String toString(){
        return tenNV +" ," + maNV + " ," + gioiTinh + " ," + ngaySinh;
    }

}
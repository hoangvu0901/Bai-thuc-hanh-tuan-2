package nguyentanhoangvu_23657941;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	public static final double THUE =0.1;
	private String XuatXu;
	@Override
	public double getThanhTien() {
		if (getXuatXu()=="NgoaiNhap") {
			return getSoLuong()*getDonGia()+THUE;
		}else {
			return getSoLuong()*getDonGia();
		}

	}
	public String getXuatXu() {
		return XuatXu;
	}
	public void setXuatXu(String xuatXu) {
		XuatXu = xuatXu;
	}
  public SachThamKhao(String MaSach,String NhaXB, LocalDate NgayNhap,
		  double DonGia, int SoLuong, String XuatXu)
  {	
   super(MaSach, NhaXB, NgayNhap,DonGia, SoLuong,XuatXu);
   this.XuatXu = XuatXu;
	  
  }
  public SachThamKhao() {}
}


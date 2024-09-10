package hoangvu;

public class hinhchunhat {
	//khai bao
     private double ChieuiDai;
     private double ChieuRong;
     //Dong goi va rang buoc
     public double getChieuDai() {
		return ChieuiDai;
	}
	public void setChieuDai(double d) {
		if(d>0) {
			ChieuiDai = d;
		}
		else {
			System.out.println("Loi d");
		}
	}
	public double getChieuRong() {
		return ChieuRong;
	}
	public void setChieuRong(double r) {
		if(r<=0) {
			System.out.println("Loi r");
		}
		else {
			ChieuRong = r;
		}
	}
	//constructor(ham tao) dung khoi tao doi tuong (new)
	public hinhchunhat() {}
	public hinhchunhat(double d, double r) {
		if(d>0) {
			ChieuiDai = d;
		}
		else {
			System.out.println("Loi d");
			if(r<=0) {
				System.out.println("Loi r");
			}
			else {
				ChieuRong = r;
			}
		}
    }
	
		//phuong thuc
		public double getCV() {
			return (getChieuDai()+getChieuRong())*2;
		}
		public double getdientich() {
			return getChieuDai()*getChieuRong();
		}
// tao mau in tostring
		@Override
		public String toString() {
			return super.toString();
		}
	public static void main(String[] args)
	{
		// khoi tao doi tuong tu ham tao
		hinhchunhat h1= new hinhchunhat();
		h1.setChieuDai(10);
		h1.setChieuRong(5);
		System.out.println("Ket qua:");
		System.out.println("Chieu dai la:"+h1.getChieuDai());
		System.out.println("Chieu rong la :"+h1.getChieuRong());
		System.out.println("Chu vi la :"+h1.getCV());
		System.out.println("Dien tich la:"+h1.getdientich());
		
	}
	
	
    
     
     
     
     
     
}

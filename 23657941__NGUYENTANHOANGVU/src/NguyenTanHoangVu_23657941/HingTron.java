package NguyenTanHoangVu_23657941;

public class HingTron {
     private double banKinh;
     private static final double pi =3.1416;
     private Tam t;
     
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if (t!=null)
 		{
			this.t = t;
 		} else
 		{
 			throw new Exception("Loi");
 		}	
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double r) throws Exception {
		if (r>0)
 		{
 			this.banKinh = r;
 		} else
 		{
 			throw new Exception("Loi");
 		}	
	}
	public HingTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}
	public HingTron() {}
	public HingTron(double banKinh, Tam t) {
		super();
		this.banKinh = banKinh;
		this.t = t;
	}
	public double getTinhDt() {
		return getBanKinh()*getBanKinh()*pi;
	}
	public double getCV() {
		return getBanKinh()*2*pi;
	}
	@Override
	public String toString() {
		String s="";
		s=s+s.format("%-3s,%10s,%10s",getBanKinh(),getTinhDt(),getCV());
		return s;
	}
     
}

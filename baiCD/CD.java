package baiCD;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if(maCD > 0)
			this.maCD = maCD;
		else
			this.maCD = 999999;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if(!tuaCD.trim().equals(""))
			this.tuaCD = tuaCD;
		else
			this.tuaCD = "chua xac dinh";
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat > 0)
			this.soBaiHat = soBaiHat;
		else
			this.soBaiHat = 0;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		if(giaThanh > 0)
			this.giaThanh = giaThanh;
		else
			this.giaThanh = 0;
	}
	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}
	public CD() {
		this(999999, "chua xac dinh", 0, 0);
	}

	public String toString() {
		return String.format("CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBaiHat=" + soBaiHat + ", giaThanh=" + giaThanh + "]");
	}
	
	
	
}

package baiCD;

import java.util.Arrays;

public class CDList {
	private int count;
	private CD[] CDList;

	public CDList(int n) {
		CDList = new CD[n];
		count = 0;
	}

	public CDList(int count, CD[] cDList) {
		super();
		this.count = count;
		CDList = cDList;
	}

	public int getSoLuongHienCo() {
		return count;
	}

	public CD[] getCDList() {
		return CDList;
	}

	public boolean kiemTraTrungMa(int ma) {
		for (int i = 0; i < count; i++) {
			if (CDList[i].getMaCD() == ma)
				return true;
		}
		return false;
	}

	public boolean addCD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		if (count < CDList.length) {
			for (int i = 0; i < count; i++) {
				if (CDList[i].getMaCD() != maCD) {
					CDList[count++] = new CD(maCD, tuaCD, soBaiHat, giaThanh);
					return true;
				}
			}
		}
		return false;
	}


	public String toString() {
//		return String.format();
		String s = "";
		for(int i=0; i<count; i++)
		{
			s = CDList[i] + " ";
		}
		return s;
	}
	
}

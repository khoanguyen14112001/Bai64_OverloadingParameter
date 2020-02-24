package commityuni.com.test;

import commityuni.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham(1,"coca",2500);
		SanPham sp2 = new SanPham(2,"pepsi",5000);
		SanPham sp3 = new SanPham(3,"sting",7500);
		
		double t = SanPham.tongTien(sp1,sp2,sp3);
		System.out.println("Tổng tiền : " + t);
				

	}

}

package com.qlsv.ui;

import java.io.PrintWriter;

import com.qlsv.entity.SinhVien;

public class SVOutAdd {
	private PrintWriter out;
	
	

	public SVOutAdd() {
	}



	public SVOutAdd(PrintWriter out) {
		this.out = out;
	}
	
	public void showMessage(SinhVien sv) {
		
		out.println("Đã thêm một SV vào CSDL!!!!");
		out.flush();

		out.println(sv);//toString
		out.flush();
		
		out.println("[MÃ SV]: " + sv.getMaSV());
		out.flush();
		out.println("[TÊN SV]: " + sv.getHoTen());
		out.flush();
		
	}
	
	

}

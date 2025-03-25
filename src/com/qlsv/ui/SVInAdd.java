package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;

public class SVInAdd {
	
	private Scanner in;
	private PrintWriter out;
	
	public SVInAdd(Scanner in, PrintWriter out) {
		this.in = in;
		this.out = out;
	}
	
	private SinhVien inputSV() {
		//xử lý nhập phần chung/ cha
		SinhVien sv = null;
		int maSV;
		String hoTen;
		String nganh;
		Date ngaySinhJava;
		String ngaySinh;
		out.print("[MÃ SINH VIÊN]:");
		out.flush();
		maSV = in.nextInt();
		in.nextLine();
		out.print("[HO TEN SV]:");
		out.flush();

		hoTen = in.nextLine();
		out.print("[NGAY SINH, dd/MM/yyyy]:");
		out.flush();

		ngaySinh = in.nextLine();
		//chuyen ngay kieu chuoi
		//thanh ngay kieu Java
		out.print("[NGANH HOC \"KT\" / \"PM\"]:");
		out.flush();

		nganh = in.nextLine();
		//kiem tra xem user nhap nganh gi?
		if("KT".equalsIgnoreCase(nganh)) {
			sv = inputSVKT(maSV, hoTen, "KT", null);
		}
		
		if("PM".equalsIgnoreCase(nganh)) {
			inputSVPM();
		}
		return sv;
	}
	
	private SinhVien inputSVPM() {
		return null;
		
	}
	
	private SinhVien inputSVKT(int maSV, String hoTen, String nganh,
			Date ngaySinh) {
		double diemMarketing;
		double diemSale;

		out.print("[DIEM MARKETING]:");
		out.flush();

		diemMarketing = in.nextDouble();
		
		out.print("[DIEM SALES]:");
		out.flush();

		diemSale = in.nextDouble();
		
		SinhVienKT svKT = new SinhVienKT(maSV, hoTen, 
				nganh, ngaySinh,
				diemMarketing, diemSale);
		
		
		return svKT;
		
	}
	
	
	
	

}

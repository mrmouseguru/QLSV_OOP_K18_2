package com.qlsv.entity;

import java.util.Date;

public class SinhVien {
	
	private int maSV;
	private String hoTen;
	private String nganh;
	private Date ngaySinh;
	
	protected SinhVien() {}
	
	protected SinhVien(int maSV, String hoTen, String nganh, Date ngaySinh) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.nganh = nganh;
		this.ngaySinh = ngaySinh;
	}
	
	protected double tinhDiem() {
		return 0;
	}
	
	private String tinhHocLuc() {
		
		double diemTB = tinhDiem();
		if (diemTB < 5) {
            return "Yếu";
        } else if (diemTB < 6.5) {
            return "Trung bình";
        } else if (diemTB < 7.5) {
            return "Khá";
        } else if (diemTB < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
		
	}
	
	public int getMaSV() {
		return this.maSV;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public void setHoTen(String newHoTen) {
		this.hoTen = newHoTen;
	}
	@Override
	public String toString() {
		return "[MASV]: " + this.maSV + " " + 
				"[HO TÊN SV]: " + this.hoTen + " " ;
	}
	
	

}

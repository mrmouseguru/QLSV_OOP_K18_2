package com.qlsv.database;

import java.util.ArrayList;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;
import com.qlsv.entity.SinhVienPM;

public class MemorySVDB {
	private static ArrayList<SinhVien> svDB;
	
	//static block code
	static {
		
		svDB = new ArrayList<SinhVien>();
		SinhVienPM svPM1 = new SinhVienPM(111,"Le van teo", "PM",
				null,5, 5, 5);
		SinhVienPM svPM2 = new SinhVienPM(333,"Le van Meo", "PM",
				null,7, 7, 7);
		
		SinhVienKT svKT1 = new SinhVienKT(222, "Nguyen Thi Suu",
				"KT", null, 9, 9);
		svDB.add(svKT1);
		svDB.add(svPM1);
		svDB.add(svPM2);
		
	}
	
	public static void insert(SinhVien sv) {
		
		svDB.add(sv);
		
	}
	
	//lấy danh sách Sinh viên
	
	// sửa
	
	// xóa
	
	// tìm kiếm 
	
	

}

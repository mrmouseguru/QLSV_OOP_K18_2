package com.qlsv.database;

import com.qlsv.entity.SinhVien;

public class SVAddDAO {
	
	
	//nếu bạn không tạo hàm khởi tạo nào hết
	//Java sẽ tự động cung cấp một hàm
	//khởi tạo mặc định không tham số
	
	public void insert(SinhVien sv) {
		
		//gọi hàm
		MemorySVDB.insert(sv);
	}

}

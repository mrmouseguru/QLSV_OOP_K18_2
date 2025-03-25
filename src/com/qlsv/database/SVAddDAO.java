package com.qlsv.database;

import com.qlsv.entity.SinhVien;

public class SVAddDAO {
	
	private void insert(SinhVien sv) {
		
		//gọi hàm
		MemorySVDB.insert(sv);
	}

}

package com.qlsv.control;

import com.qlsv.database.SVAddDAO;
import com.qlsv.entity.SinhVien;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVOutAdd;

public class SVControlAdd {
	
	private SVAddDAO svAddDAO;
	private SVInAdd svInAdd;
	private SVOutAdd svOutAdd;
	
	
	
	//constructors()

	public SVControlAdd() {
	}

	public SVControlAdd(SVAddDAO svAddDAO, 
			SVInAdd svInAdd, SVOutAdd svOutAdd) {
		this.svAddDAO/*field*/ = svAddDAO /*htam số*/;
		this.svInAdd = svInAdd;
		this.svOutAdd = svOutAdd;
	}
	
	public void add() {
		SinhVien sv;
		//phối hợp với các đối tượng
		//1. gửi thông điệp cho đối tượng SVInAdd
		//SVInAdd - nhận thông tin SV mà 
		//người dùng nhập vào
		sv = svInAdd.inputSV();
		
		//2. gửi thông điệp đến object SVAddDAO
		//thêm sinh viên vừa được nhập vào CSDL
		svAddDAO.insert(sv);
		
		//3. gửi thông điệp đến object SVOUtAdđ
		//để hiển thị kết quả cho user
		svOutAdd.showMessage(sv);
	}
	
	

}

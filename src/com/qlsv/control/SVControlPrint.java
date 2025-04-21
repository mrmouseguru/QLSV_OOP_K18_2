package com.qlsv.control;

import java.util.ArrayList;

import com.qlsv.database.MemorySVPrintDAO;
import com.qlsv.database.SVPrintDAO;
import com.qlsv.entity.SinhVien;
import com.qlsv.ui.SVOutPrint;

public class SVControlPrint {
	 
	//private MemorySVPrintDAO svPrintDAO;
	private SVOutPrint svOutPrint;
	private SVPrintDAO svPrintDAO;
	
	
	public SVControlPrint(SVPrintDAO svPrintDAO, SVOutPrint svOutPrint) {
		this.svPrintDAO = svPrintDAO;
		this.svOutPrint = svOutPrint;
	}
	
	public void printDSSV() {
		ArrayList<SinhVien> dsSV;
		//gửi thông điệp đến object SVPrintDAO
		dsSV = svPrintDAO.getDSSV();
		
		//gửi thông điệp đến đối tojwng SVOutPrint
		svOutPrint.showDSSV(dsSV);
	}
	
	

}

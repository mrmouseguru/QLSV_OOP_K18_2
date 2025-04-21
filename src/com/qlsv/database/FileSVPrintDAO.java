package com.qlsv.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.qlsv.entity.SinhVien;

public class FileSVPrintDAO extends SVPrintDAO{

	@Override
	public ArrayList<SinhVien> getDSSV() {
		ArrayList<SinhVien> dsSV = 
				new ArrayList<SinhVien>();
		FileInputStream fIS;
		ObjectInputStream oIS;
		SinhVien sv;
		
		
		try {
			//1. kết nối đến file sv.db
			fIS = new FileInputStream("sv.db");
			//2. lấy dữ liệu sih viên lên
			
			oIS = new ObjectInputStream(fIS);
			dsSV= (ArrayList<SinhVien>)oIS.readObject();
			
			//đóng
			fIS.close();
			oIS.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return dsSV;
	}

}

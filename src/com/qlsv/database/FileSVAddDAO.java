package com.qlsv.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.qlsv.entity.SinhVien;

public class FileSVAddDAO implements SVAddDAO {

	@Override
	public void insert(SinhVien sv) {
		FileOutputStream fOS;
		ObjectOutputStream oOS;
		ArrayList<SinhVien> dsSV = 
				new ArrayList<SinhVien>();
		
		try {
			//đọc danh sách sv đã có trong file
			dsSV = readSVFromFile();
			//1. kết nối đến file sv.db
			fOS = new FileOutputStream("sv.db");
			//2. lưu đối tượng sv vào file sv.db
			oOS = new ObjectOutputStream(fOS);
			dsSV.add(sv);
			oOS.writeObject(dsSV);
			fOS.close();
			oOS.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private ArrayList<SinhVien> readSVFromFile() {
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

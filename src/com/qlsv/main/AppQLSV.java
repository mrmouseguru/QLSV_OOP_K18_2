package com.qlsv.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.control.SVControlAdd;
import com.qlsv.database.SVAddDAO;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVMenu;
import com.qlsv.ui.SVOutAdd;

public class AppQLSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bước 1
		PrintWriter out;
		SVMenu menu;
		Scanner in;
		String prompt = "->";
		SVControlAdd svControlAdd;
		SVAddDAO svAddDAO;
		SVInAdd svInAdd;
		SVOutAdd svOutAdd;
		
		
		//bước 3		//Bước 2
		out =          new PrintWriter(System.out);
		in =          new Scanner(System.in);
		svAddDAO =  new SVAddDAO();
		svInAdd =  new SVInAdd(in, out);
		svOutAdd = new SVOutAdd(out);
		
		svControlAdd =  new SVControlAdd(svAddDAO, 
				svInAdd, svOutAdd);
		
		//menu = new SVMenu(out, in, prompt);
		menu = new SVMenu(out, in, prompt, svControlAdd);
		
		//gửi thông điệp
		out.println("~~~~CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN~~~~");
		out.flush();
		
		//gửi thông điệp
		menu.controlLoop();
		
		
	}

}

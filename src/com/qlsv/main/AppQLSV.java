package com.qlsv.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.control.SVControlAdd;
import com.qlsv.control.SVControlPrint;
import com.qlsv.database.MemorySVAddDAO;
import com.qlsv.database.SVPrintDAO;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVMenu;
import com.qlsv.ui.SVOutAdd;
import com.qlsv.ui.SVOutPrint;

public class AppQLSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bước 1
		PrintWriter out;
		SVMenu menu;
		Scanner in;
		String prompt = "->";
		SVControlAdd svControlAdd;
		MemorySVAddDAO svAddDAO;
		SVInAdd svInAdd;
		SVOutAdd svOutAdd;
		SVControlPrint svControlPrint;
		SVPrintDAO svPrintDAO;
		SVOutPrint svOutPrint;
		
		
		
		//bước 3		//Bước 2
		out =          new PrintWriter(System.out);
		in =          new Scanner(System.in);
		svPrintDAO = new SVPrintDAO();
		svOutPrint = new SVOutPrint(out);
		svControlPrint =  new SVControlPrint(svPrintDAO, svOutPrint);
		
		svAddDAO =  new MemorySVAddDAO();
		svInAdd =  new SVInAdd(in, out);
		svOutAdd = new SVOutAdd(out);
		
		svControlAdd =  new SVControlAdd(svAddDAO, 
				svInAdd, svOutAdd);
		
		//menu = new SVMenu(out, in, prompt);
		menu = new SVMenu(out, in, prompt, svControlAdd);
		menu.setSVControlPrint(svControlPrint);
		
		//gửi thông điệp
		out.println("~~~~CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN~~~~");
		out.flush();
		
		//gửi thông điệp
		menu.controlLoop();
		
		
	}

}

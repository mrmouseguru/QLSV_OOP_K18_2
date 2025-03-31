package com.qlsv.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.ui.SVMenu;

public class AppQLSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bước 1
		PrintWriter out;
		SVMenu menu;
		Scanner in;
		String prompt = "->";
		
		
		//bước 3		//Bước 2
		out =          new PrintWriter(System.out);
		in =          new Scanner(System.in);
		
		menu = new SVMenu(out, in, prompt);
		
		//gửi thông điệp
		out.println("~~~~CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN~~~~");
		out.flush();
		
		//gửi thông điệp
		menu.controlLoop();
		
		
	}

}

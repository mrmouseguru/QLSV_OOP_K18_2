package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class SVMenu {
	
	PrintWriter out;
	Scanner in;
	String prompt;
	
	public SVMenu(){
		
	}
	
	public SVMenu(PrintWriter _out,
				Scanner _in,
					String _prompt){
		in = _in;
		out = _out;
		prompt = _prompt;
	}

	public void controlLoop() {
		out.println("gõ lệnh \"help\" dể được hỗ trợ!");
		out.flush();
		while(true) {
			String command = " ";
			out.print(prompt);
			out.flush();
			command = in.nextLine();//<== HELP , ABOUT, ADD, PRINT
			command = command.trim();//cắt khoảng trắng 2 đầu
			
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}
		}
	}



	void help() {
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] huong dan su dung phan mem");
		out.flush();
		out.println("[ABOUT] thong tin ve PM quan lý chuyến xe");
		out.flush();
		out.println("[ADD] them mới một Sinh Viên");
		out.flush();
		out.println("[PRINT] in tất cả chuyến xe");
		out.flush();
		out.println("[EXIT] thoát khỏi phần mềm");
		out.flush();
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		
	}
	
}

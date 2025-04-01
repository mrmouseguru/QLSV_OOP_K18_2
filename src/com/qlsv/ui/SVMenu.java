package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.control.SVControlAdd;
import com.qlsv.control.SVControlPrint;

public class SVMenu {
	
	private PrintWriter out;
	private Scanner in;
	private String prompt;
	private SVControlAdd svControlAdd; 
	private SVControlPrint svControlPrint;
	
	public SVMenu(){
		
	}
	
	
	public void setSVControlPrint(SVControlPrint svControlPrint) {
		this.svControlPrint = svControlPrint;
	}
	
	
	public SVMenu(PrintWriter _out,
				Scanner _in,
					String _prompt){
		in = _in;
		out = _out;
		prompt = _prompt;
	}
	
	

	public SVMenu(PrintWriter out, Scanner in, String prompt, 
			SVControlAdd svControlAdd) {
//		this.out = out;
//		this.in = in;
//		this.prompt = prompt;
		this(out, in, prompt);
		this.svControlAdd = svControlAdd;
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
			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
			if("printAll".equalsIgnoreCase(command)) {
				printAllDSSV();
				continue;
			}
		}
	}



	private void printAllDSSV() {
		// TODO Auto-generated method stub
		//gửi thông điệp điến object SVConrolPirnt
		svControlPrint.printDSSV();
	}


	private void help() {
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
	
	private void add() {
		//gửi thông điệp đến objec SVControlAdd
		svControlAdd.add();
	}
	
}

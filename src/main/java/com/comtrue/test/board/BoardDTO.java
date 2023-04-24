package com.comtrue.test.board;

import org.springframework.stereotype.Component;

@Component
public class BoardDTO {
	private String mem_num;
	private String mem_name;
	private String mem_phone;
	private String mem_rank;
	private String mem_email;
	
	
	public String getMem_num() {
		return mem_num;
	}
	public void setMem_num(int num) {
		if(num < 10) {
			this.mem_num = "00"+num;
		}else if(num < 100) {
			this.mem_num = "0"+num;
		} else {
			this.mem_num = Integer.toString(num);
		}
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone.substring(0,3)+"-"+mem_phone.substring(3,4)+"-"+mem_phone.substring(7,4);
	}
	public String getMem_rank() {
		return mem_rank;
	}
	public void setMem_rank(int rank) {
		String data = "";
		
		switch(rank) {
			case 0: data = "인턴"; break;
			case 1: data = "사원"; break;
			case 2: data = "대리"; break;
			case 3: data = "과장"; break;
			case 4: data = "차장"; break;
			case 5: data = "부장"; break;
			default: data = "인턴"; return;
		}
		
		this.mem_rank = data;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
}
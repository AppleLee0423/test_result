package com.comtrue.test.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board/**")
public class BoardController {
	@Autowired BoardService service;
	
	@RequestMapping(value="insert")
	public String insert(Model model) {
		int insert_num = service.insert_num();
		model.addAttribute("insert_num",insert_num);
		return "insert";
	}
	
	@RequestMapping(value="insert_member")
	public String insert_member(Model model, BoardDTO boardDTO) {
		int result = service.insert(boardDTO);
		if(result > 0) {
			return "select";
		} else {
			model.addAttribute("boardDTO",boardDTO);
			return "insert";
		}
	}
	
	@RequestMapping(value="select")
	public String select(Model model) {
		Map<String,Object> selectMap =service.select(); 
		model.addAttribute("selectMap",selectMap);
		return "select";
	}
	
	@RequestMapping(value="search")
	public @ResponseBody Map<String, Object> search(@RequestParam Map<String,Object> dataMap, Model model) {
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap = service.search(dataMap);
		return searchMap;
	}
	
	@RequestMapping(value="update")
	public String update(Model model) {
		return "update";
	}
	
	@RequestMapping(value="update_member")
	public String update_member(Model model, BoardDTO boardDTO) {
		int result = service.update(boardDTO);
		if(result > 0) {
			return "select";
		} else {
			model.addAttribute("boardDTO",boardDTO);
			return "insert";
		}
	}
	
	@RequestMapping(value="delete")
	public String delete(Model model, @RequestParam("mem_num")int mem_num) {
		service.delete(mem_num);
		return "delete";
	}
}
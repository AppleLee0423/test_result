package com.comtrue.test.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Autowired BoardDAO dao;

	public int insert(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return dao.insert(boardDTO);
	}
	
	public int insert_num() {
		return dao.insert_num();
	}

	public Map<String, Object> select() {
		// TODO Auto-generated method stub
		Map<String,Object> selectMap = new HashMap<String, Object>();
		List<BoardDTO> list = dao.select() ;
		
		selectMap.put("list", list);
		return selectMap;
	}

	public Map<String, Object> search(Map<String, Object> dataMap) {
		// TODO Auto-generated method stub
		Map<String,Object> searchMap = new HashMap<String, Object>();
		List<BoardDTO> list = dao.search(dataMap);
		searchMap.put("list", list);
		return searchMap;
	}

	public int update(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return dao.update(boardDTO);
	}

	public void delete(int mem_num) {
		// TODO Auto-generated method stub
		dao.delete(mem_num);
	}
}
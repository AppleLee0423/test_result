package com.comtrue.test.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardDAO {
	@Autowired SqlSession sqlSession;
	

	public int insert(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return sqlSession.insert("mapper.board.insert", boardDTO);
	}
	
	public int insert_num() {
		return sqlSession.selectOne("mapper.board.insert_num");
	}

	public List<BoardDTO> select() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("mapper.board.select");
	}

	public List<BoardDTO> search(Map<String, Object> dataMap) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("mapper.board.search",dataMap);
	}

	public int update(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return sqlSession.update("mapper.board.update", boardDTO);
	}

	public void delete(int mem_num) {
		// TODO Auto-generated method stub
		sqlSession.delete("mapper.board.delete", mem_num);
	}
}
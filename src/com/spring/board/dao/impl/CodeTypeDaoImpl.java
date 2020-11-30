package com.spring.board.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.dao.CodeTypeDao;
import com.spring.board.vo.CodeTypeVo;
import com.spring.board.vo.PageVo;

@Repository
public class CodeTypeDaoImpl implements CodeTypeDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<CodeTypeVo> selectCodeTypeList(PageVo pageVo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("codeType.codeTypeList",pageVo);
	}

	@Override
	public CodeTypeVo selectCodeType(CodeTypeVo codeTypeVo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("codeType.codeTypeList", codeTypeVo);
	}

	@Override
	public int selectCodeTypeCnt() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("codeType.codeTypeTotal");
	}

	/*
	 * @Override public int codeTypeInsert(CodeTypeVo codeTypeVo) throws Exception {
	 * // TODO Auto-generated method stub return
	 * sqlSession.insert("codeType.codeTypeInsert", codeTypeVo); }
	 * 
	 * @Override public int codeTypeUpdate(CodeTypeVo codeTypeVo) throws Exception {
	 * // TODO Auto-generated method stub return
	 * sqlSession.update("codeType.codeTypeUpdate", codeTypeVo); }
	 * 
	 * @Override public int codeTypeDelete(CodeTypeVo codeTypeVo) throws Exception {
	 * // TODO Auto-generated method stub return
	 * sqlSession.delete("codeType.codeTypeDelete", codeTypeVo); }
	 */

}

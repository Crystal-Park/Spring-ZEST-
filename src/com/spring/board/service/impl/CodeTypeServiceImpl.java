package com.spring.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.board.dao.CodeTypeDao;
import com.spring.board.service.CodeTypeService;
import com.spring.board.vo.CodeTypeVo;
import com.spring.board.vo.PageVo;

public class CodeTypeServiceImpl implements CodeTypeService{
	
	@Autowired
	CodeTypeDao codeTypeDao;

	@Override
	public List<CodeTypeVo> selectCodeTypeList(PageVo pageVo) throws Exception {
		// TODO Auto-generated method stub
		return codeTypeDao.selectCodeTypeList(pageVo);
	}

	@Override
	public CodeTypeVo selectCodeType(String codeType, String codeId) throws Exception {
		// TODO Auto-generated method stub
		CodeTypeVo codeTypeVo = new CodeTypeVo();
		
		codeTypeVo.setCodeType(codeType);
		codeTypeVo.setCodeId(codeId);
		
		return codeTypeDao.selectCodeType(codeTypeVo);
	}

	@Override
	public int selectCodeTypeCnt() throws Exception {
		// TODO Auto-generated method stub
		return codeTypeDao.selectCodeTypeCnt();
	}

	/*
	 * @Override public int codeTypeInsert(CodeTypeVo codeTypeVo) throws Exception {
	 * // TODO Auto-generated method stub return
	 * codeTypeDao.codeTypeInsert(codeTypeVo); }
	 * 
	 * @Override public int codeTypeUpdate(String codeType, String codeId, String
	 * codeName, String modifier) throws Exception { // TODO Auto-generated method
	 * stub CodeTypeVo codeTypeVo = new CodeTypeVo();
	 * 
	 * codeTypeVo.setCodeType(codeType); codeTypeVo.setCodeId(codeId);
	 * codeTypeVo.setModifier(modifier);
	 * 
	 * return codeTypeDao.codeTypeUpdate(codeTypeVo); }
	 * 
	 * @Override public int codeTypeDelete(String codeType, String codeId) throws
	 * Exception { // TODO Auto-generated method stub CodeTypeVo codeTypeVo = new
	 * CodeTypeVo();
	 * 
	 * codeTypeVo.setCodeType(codeType); codeTypeVo.setCodeId(codeId);
	 * 
	 * return codeTypeDao.codeTypeDelete(codeTypeVo); }
	 * 
	 * @Override public int codeTypeDelete(CodeTypeVo codeTypeVo) throws Exception {
	 * // TODO Auto-generated method stub return
	 * codeTypeDao.codeTypeDelete(codeTypeVo); }
	 */

}

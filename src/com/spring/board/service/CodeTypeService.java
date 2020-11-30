package com.spring.board.service;

import java.util.List;

import com.spring.board.vo.CodeTypeVo;
import com.spring.board.vo.PageVo;

public interface CodeTypeService {
	
	public List<CodeTypeVo> selectCodeTypeList(PageVo pageVo) throws Exception;

	public CodeTypeVo selectCodeType(String codeType, String codeId) throws Exception;
	
	public int selectCodeTypeCnt() throws Exception;

	/*
	 * public int codeTypeInsert(CodeTypeVo codeTypeVo) throws Exception;
	 * 
	 * public int codeTypeUpdate(String codeType, String codeId, String codeName,
	 * String modifier) throws Exception;
	 * 
	 * public int codeTypeDelete(String codeType, String codeId) throws Exception;
	 * 
	 * public int codeTypeDelete(CodeTypeVo codeTypeVo) throws Exception;
	 */

}

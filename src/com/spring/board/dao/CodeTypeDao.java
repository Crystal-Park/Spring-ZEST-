package com.spring.board.dao;

import java.util.List;

import com.spring.board.vo.CodeTypeVo;
import com.spring.board.vo.PageVo;

public interface CodeTypeDao {
	
	public List<CodeTypeVo> selectCodeTypeList(PageVo pageVo) throws Exception;
	
	public CodeTypeVo selectCodeType(CodeTypeVo codeTypeVo) throws Exception;
	
	public int selectCodeTypeCnt() throws Exception;
	
//	public int codeTypeInsert(CodeTypeVo codeTypeVo) throws Exception;
	
//	public int codeTypeUpdate(CodeTypeVo codeTypeVo) throws Exception;
	
//	public int codeTypeDelete(CodeTypeVo codeTypeVo) throws Exception;
}

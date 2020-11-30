package com.spring.board.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.board.HomeController;
import com.spring.board.service.CodeTypeService;
import com.spring.board.vo.CodeTypeVo;
import com.spring.board.vo.PageVo;

public class CodeTypeController {
	
	@Autowired
	CodeTypeService codeTypeService;
	
	private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/board/codeTypeList.do", method = RequestMethod.GET)
	public String codeTypeList(Locale locale, Model model,PageVo pageVo) throws Exception{
		
		List<CodeTypeVo> codeTypeList = new ArrayList<CodeTypeVo>();
		
		String page = "1";
		int totalCnt = 0;
		
		if(pageVo.getPageNo() == null){
			pageVo.setPageNo(page);
		}
		
		codeTypeList = codeTypeService.selectCodeTypeList(pageVo);
		totalCnt = codeTypeService.selectCodeTypeCnt();
		
		model.addAttribute("codeTypeList", codeTypeList);
		model.addAttribute("totalCnt", totalCnt);
		model.addAttribute("pageNo", page);
		
		return "codeType/codeTypeList";
	}
	
	@RequestMapping(value = "/board/{codeType}/{codeId}/codeTypeView.do", method = RequestMethod.GET)
	public String boardView(Locale locale, Model model
			,@PathVariable("codeType")String codeType
			,@PathVariable("codeId")String codeId) throws Exception{
		
		CodeTypeVo codeTypeVo = new CodeTypeVo();
		
		codeTypeVo = codeTypeService.selectCodeType(codeType,codeId);
		
		model.addAttribute("codeType", codeType);
		model.addAttribute("codeId", codeId);
		model.addAttribute("codeTypeVo", codeTypeVo);
		
		return "codeType/codeTypeView";
	}
}

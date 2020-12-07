<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>list</title>
</head>
<script type="text/javascript">

	$j(document).ready(function(){
		$j("#submit").on("click",function(){
			var $frm = $j('.boardList :input');
			var param = $frm.serialize();
			
			console.log(param);
			
			$j.ajax({
			    url : "/board/boardList.do",
			    dataType: "json",
			    type: "POST",
			    data : param,
			    success: function(data, textStatus, jqXHR)
			    {
					alert("�����ȸ�Ϸ�");
					
					alert("�޼���:"+data.success);
						
					location.href = "/board/boardList.do";
			    },
			    error: function (jqXHR, textStatus, errorThrown)
			    {
			    	alert("����");
			    }
			});
		});
		
	});

</script>
<body>
<form class="boardList">
<table  align="center">
	<tr>
		<td align="right">
			total : ${totalCnt}
		</td>
	</tr>
	<tr>
		<td>
			<table id="boardTable" border = "1">
				<tr>
					<td width="80" align="center">
						Type
					</td>
					<td width="40" align="center">
						No
					</td>
					<td width="300" align="center">
						Title
					</td>
				</tr>
				<c:forEach items="${boardList}" var="list">
					<tr>
						<td align="center">
							${list.boardType}
						</td>
						<td>
							${list.boardNum}
						</td>
						<td>
							<a href = "/board/${list.boardType}/${list.boardNum}/boardView.do?pageNo=${pageNo}">${list.boardTitle}</a>
						</td>
					</tr>	
				</c:forEach>
			</table>
		</td>
	</tr>
	<tr>
		<td align="right">
			<a href ="/board/boardWrite.do">�۾���</a>
		</td>
	</tr>

	<tr>
		<td align="left">
			<label><input type="checkbox" name="boardType" value="a01">��ü</label>
			<label><input type="checkbox" name="boardType" value="a01">�Ϲ�</label>
			<label><input type="checkbox" name="boardType" value="a02">Q&A</label>
			<label><input type="checkbox" name="boardType" value="a03">�͸�</label>
			<label><input type="checkbox" name="boardType" value="a04">����</label>
			<input id="submit" type="button" value="��ȸ">
		</td>
	</tr>
</table>
</form>	
</body>
</html>
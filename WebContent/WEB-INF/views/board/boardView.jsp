<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>boardView</title>
</head>
<script type="text/javascript">

	$j(document).ready(function(){
		$j("#update").on("click",function(){
				var $frm = $j('.boardView :input');
				var param = $frm.serialize();
				
				$j.ajax({
				    url : "/board/${boardType}/${boardNum}/boardUpdateAction.do",
				    dataType: "json",
				    type: "POST",
				    data : param,
				    success: function(data, textStatus, jqXHR)
				    {
						alert("�����Ϸ�");
						
						alert("�޼���:"+data.success);
							
						location.href = "/board/boardList.do?pageNo=1";
				    },
				    error: function (jqXHR, textStatus, errorThrown)
				    {
				    	alert("����");
				    }
				});
			});
				
		$j("#delete").on("click",function(){
			var $frm = $j('.boardView :input');
			var param = $frm.serialize();
					
			$j.ajax({
			    url : "/board/${board.boardType}/${board.boardNum}/boardDeleteAction.do",
			    dataType: "json",
			    type: "POST",
			    data : param,
			    success: function(data, textStatus, jqXHR)
			    {
					alert("�����Ϸ�");
					
					alert("�޼���:"+data.success);
							
					location.href = "/board/boardList.do?pageNo=1";
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
<form class="boardView">
	<table align="center">
					<tr>
						<td align="right">
							<input id="update" type="button" value="����">
								<input id="boardType" type="hidden" value="${board.modifier}">
							<input id="delete" type="button" value="����">
						</td>
					</tr>
		<tr>
			<td>
				<table border ="1">
					<tr>
						<td width="120" align="center">
						Title
						</td>
						<td width="400">
						<input name="boardTitle" type="text" size="50" value="${board.boardTitle}"> 
						</td>
					</tr>
					<tr>
						<td height="300" align="center">
						Comment
						</td>
						<td valign="top">
							<textarea name="boardComment"  rows="20" cols="55">${board.boardComment}</textarea>
						</td>
					</tr>
					<tr>
						<td align="center">
						Writer
						</td>
						<td>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td align="right">
				<a href="/board/boardList.do?pageNo=1">List</a>
			</td>
		</tr>
	</table>
</form>	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
	$(function(){
		$("#myform").ajaxForm({
			beforeSubmit:function(){//表单提交之前执行的回调函数，返回true，则表单可以提交，返回false，则表单不能提交
				//验证数据
				return true;				
			},
			dataType:"text",
			resetForm:true,
			success:function(data){//成功回调函数
				$("#span1").html(data);//文本元素赋值
			}
		});
	});
</script>
</head>
<body>
<h1>本页面测试jQuery封装的ajaxForm插件使用:<span id="span1"></span></h1>

<form action="testAjaxFormServlet" method="post" id="myform">
用户名：<input type="text" name="username">
<input type="submit" value="提交">
</form>
</body>
</html>
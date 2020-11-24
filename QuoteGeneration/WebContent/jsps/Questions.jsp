<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cg.PolicyQuestions" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Questions</title>
</head>
<body>
<form action="policycreate.htm" method="POST" modelAttribute="policycreate">
		<% List<PolicyQuestions> Policyques=(List<PolicyQuestions>)request.getAttribute("ques");
			 for(PolicyQuestions quest:Policyques) {%>
				<%=quest.getPol_Ques_Desc() %>: <input type="radio" name="Answer" value=<%=quest.getPol_Ques_Ans1() %>>
  												<label for=<%=quest.getPol_Ques_Ans1() %>><%=quest.getPol_Ques_Ans1() %></label><br>
  												<input type="radio" name="Answer" value=<%=quest.getPol_Ques_Ans2() %>>
  												<label for=<%=quest.getPol_Ques_Ans2() %>><%=quest.getPol_Ques_Ans2() %></label><br>
  												<input type="radio" name="Answer" value=<%=quest.getPol_Ques_Ans3() %>>
  												<label for=<%=quest.getPol_Ques_Ans3() %>><%=quest.getPol_Ques_Ans3() %></label><br>
			<%} %>
		</form>
</body>
</html>
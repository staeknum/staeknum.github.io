<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="diceroll.PlayOnline"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result...</title>
</head>
<body>
	<h1>Calculation Result is...</h1>
	<br>
	<%
		request.getAttribute("DiceType");
		request.getAttribute("countDiceQty");
		try {
			if ((request.getAttribute("DiceType") != null) && (request.getAttribute("countDiceQty") != null)) {
				/**
				*FWしてきた値がnullでないかのチェック。
				**/
	%>
	<%
		String strTy = (String) request.getAttribute("DiceType");
				String strQt = (String) request.getAttribute("countDiceQty");
				assert (strTy != null) || (strQt != null) : "ForwardParameter is null";
	%>

	<%
		PlayOnline p = new PlayOnline();
				StringBuilder resultSb = new StringBuilder();
				int inty = Integer.parseInt(strTy);
				int inqt = Integer.parseInt(strQt);
				resultSb = p.play(inty, inqt);
				out.println("DiceType is " + strTy + ", Dice Qty is " + strQt);
				out.println("<p>" + resultSb + "</p>");
	%>
	<p>
		<%
			} else { //End If
					out.println("<p>Error</p>");
				}
			} catch (NullPointerException e) {
				out.println("<p>ｶﾞｯ</p>");
			} catch (NumberFormatException e) {
				out.println("<p>贵樣!文字列を入ねなぃてくだちぃ</p>");
			}
		%>
	</p>



</body>
</html>

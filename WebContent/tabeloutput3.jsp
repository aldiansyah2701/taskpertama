<%@page import="java.sql.Connection" %>
<%@page import="paragraf.output2" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Statement statement = null;
	ResultSet resultSet = null;


	output2 db = new output2();
	Connection conn = db.getConnection();
	if(conn == null){
		out.println("connection failed");
	}
	else{
		out.println("connection succed");
	}
	statement=conn.createStatement();
	String sql ="SELECT NO,input,output,DATE_FORMAT(tanggal, '%d %M %Y'), parameter FROM output2";

	resultSet = statement.executeQuery(sql);
		
		%>
	<table border="2">
	 
	   <tr>
	        <th>NO</th>
	        <th>INPUT</th>
	        <th>OUTPUT</th>
	        <th>TANGGAL PROSES</th>
	        <th>KATA BERULANG</th>
	   </tr>	   
       <tbody>

		<% while(resultSet.next()){ %>
		<tr>
		<td><%=resultSet.getString("no") %></td>
		<td><%=resultSet.getString("input") %></td>
		<td><%=resultSet.getString("output") %></td>
		<td><%=resultSet.getString("DATE_FORMAT(tanggal, '%d %M %Y')") %></td>
		<td><%=resultSet.getString("parameter") %></td>
		</tr>
		<% }%>
		
		</tbody>
	 </table>
		<%
	
	
%>
</body>
</html>
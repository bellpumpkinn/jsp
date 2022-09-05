<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%-- %@는 directive라 읽는다. --%>
<%@ page import='java.time.LocalDate' %>
<%@ page import='java.util.Date' %>
<%
	LocalDate date = LocalDate.now();
	Date date2 = new Date();
%>
<%= date %> <br>
<%= date2 %>

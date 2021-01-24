<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Study.JSP_2020_11_13.bo.*" %>
<%@ page import="Study.JSP_2020_11_13.dao.*" %>
<%
	String itemNo = request.getParameter("ITEM_NO");
	int ret = PoItemDao.delete(itemNo);
	response.sendRedirect("PoItemList.jsp");
%>
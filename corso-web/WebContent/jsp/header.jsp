<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://paolopreite.it/corso-web-taglib" prefix="web" %>
<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>Home</title>
	</head>

<body>
	<header>
		<web:benvenuto />
		<web:input nomeInput="nome" valoreInput="Paolo Preite"></web:input>
		<ul>
			<li><a href="">Menù 1</a>
			<li><a href="">Menù 2</a>
		</ul>
		<!-- out consente di scrivere nella pagina -->
		<c:out value="PROVA DI CONFIGURAZIONE!!!"></c:out><br>
		<!-- all'interno possiamo inserire codice scriptlet. il parametro default specifica cosa scrivere nel caso l'attributo non sia leggibile -->
		<c:out value="<%= request.getParameter(\"test\") %>" default="Ecco!"></c:out><br>
		<!-- ma è sconsigliato utilizzarlo. è consigliato scrivere codice in questa maniera -->
		<c:out value="${param.test}" default="Ecco!"></c:out><br>
		<!-- set è utilizzato per impostare i valori delle variabili e lo leggiamo come indicato sopra -->
		<c:set var="prova" value="1234" scope="request"></c:set>
		<c:out value="${prova}" default="prova è vuota"></c:out><br>
		<h2>${prova}</h2><br>
		
		<c:if test="${param.test == null}">
			la variabile test non è stata passata nella request<br>
		</c:if>
		<!-- choose è l'analogo dello swtich case. il tag otherwise deve essere presente altrimenti non funzioneralo statement -->
		<c:choose>
			<c:when test="${param.test == 'pi'}">test equivale a pippo</c:when>
			<c:when test="${param.test == null}">test è null</c:when>
			<c:when test="${param.test == 'pl'}">test equivale a pluto</c:when>
			<c:otherwise>nessuna condizione si è verificata</c:otherwise>
		</c:choose><br>
		<hr>
		<!-- creiamo una lista da iterare sia con scriptlet che JSTL -->
		<%
			List<String> lista = new ArrayList<String>();
			lista.add("valore 1");
			lista.add("valore 2");
			lista.add("valore 3");
			lista.add("valore 4");
			lista.add("valore 5");
			
			for(String s : lista) {
				out.println(s+"<br>");
			}
			
			request.setAttribute("elementi", lista);
			/*
				COME ACCEDERE AGLI ELEMENTI DI UNA REQUEST ( -> significa analogo)
				requestScope.NOMEATTRIBUTO -> request.getAttribute
				sessionScope.NOMEATTRIBUTO -> session.getAttribute
				parameter.NOMEPARAMETRO -> request.getParameter
			*/
		%>
		<c:forEach items="${requestScope.elementi}" var="s" varStatus="i">
			<!-- per avere la posizione del contatore -->
			${s} - ${i.count}<br>
		</c:forEach>
		
		<c:forTokens items="1,2,3,4,5" delims="," var="numero" varStatus="i">
			${numero}<br>
		</c:forTokens>
		<!-- formattare una tring in url -->
		<c:url var="miaurl" value="/jsp/test-include.jsp">
			<c:param name="valore" value="1234"></c:param>
		</c:url>
		<a href="${miaurl}">Link</a><br>
		
		<hr>
		<fmt:formatNumber
		var="numero"
		value="1000.12345"
		type="currency"
		maxFractionDigits="2"
		minFractionDigits="2"
		pattern="###.##"></fmt:formatNumber>
		<p>valore formattato ${numero}</p>
		
		<%
			Calendar c = new GregorianCalendar();
			c.set(2020, 3, 8);
			request.setAttribute("dataCorrente", c.getTime());
		%>
		
		<fmt:formatDate
		value="${requestScope.dataCorrente}"
		pattern="d/M/y"
		var="data"/>
		<p>data formattata ${data}</p><br>
	</header>
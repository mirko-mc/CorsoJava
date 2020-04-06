<%@page import="java.util.List"%>
<h1>1 - Titolo Pagina</h1>
<p>
Sono nel body della pagina 1
<br>
<!-- inseriamo codice sciptlet. nelle pagine jsp è possibile utilizzare codice java col tag <%  %>-->
<%
	List<String> carrello = (List<String>) request.getSession().getAttribute("carrello");
	if (carrello != null && carrello.size() > 0) {
		int i = 0;
		for(String articolo : carrello){
			i++;
			out.println(i + ") " + articolo + "<br>");
		}
%>
<%
	} else {
		out.println("non ci sono articoli nel carrello");
	}
%>

</p>
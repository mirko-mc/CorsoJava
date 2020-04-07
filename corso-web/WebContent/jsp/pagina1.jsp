<!-- PAGE consente di definire alcune impostazioni relative alla compilazione della pagina.
	 IMPORT specifica i package da includere nella pagina per il corretto funzionamento. -->
<%@page import="java.util.List"%>
<h1>1 - Titolo Pagina</h1>
<p>
Sono nel body della pagina 1
<br>
<!-- inseriamo codice sciptlet. nelle pagine jsp è possibile utilizzare codice java col tag <%  %> -->
<%
	List<String> carrello = (List<String>)request.getSession().getAttribute("carrello");
	if (carrello != null && carrello.size() > 0) {
		int i = 0;
		for(String articolo : carrello){
			i++;
			out.println(i + ") " + articolo + "<br>");
		}
	} else {
		out.println("non ci sono articoli nel carrello");
	}
%>
</p>
<!-- SCRIPTLET: codice Java nelle pagine JSP racchiuso tra tag <%  %>
	 DICHIARAZIONE: è sconsigliato ma per dichiarare variabili o metodi è necessaria la sintassi  < %! dichiarazione %>
	 ESPRESSIONE: < %= espressione %> -->
	<%! String myVar = "casa"; %>
	<%= request.getParameter(myVar) %>
	<%! public	String isPalindroma(String text){
			// codice per parola palindroma
			return text;
			}
	%>
	<p>La parola è palindroma? <b><%=isPalindroma(myVar) %></b></p>
	
	<%= request.getParameter("test") != null ? "TEST C'E'" : "TEST NON C'E'" %>
<p>
<!-- caratteri speciali HTML
	 &lt; corrisponde a < mentre &gt; corrisponde a > 
	 se non inserivamo i simboli in questo modo sarebbero stati letti come tag HTML -->
List&lt;String&gt; carrello = (List&lt;String&gt;) request.getSession().getAttribute("carrello");
	if (carrello != null && carrello.size() > 0) {
		int i = 0;
		for(String articolo : carrello){
			i++;
			out.println(i + ") " + articolo + "<br>");
		}
	} else {
		out.println("non ci sono articoli nel carrello");
	}
</p>
<!-- sono la stessa cosa, libera scelta se utilizzare l'uno o l'altro ma preferibile con jsp -->
<!-- <jsp:include page="header.jsp"></jsp:include> -->
<%@ include file="header.jsp"%>
<!-- quando si verifica un errore verrò indirizzato alla pagina di errore scelta.
	 qui modifichiamo sempre il body della pagina HTML quindi è consigliabile mettere tale specifica
	 in header.jsp così da non doverla riscrivere in tutte le jsp che modificano il body -->
<!-- <%@ page errorPage="Error.jsp" %> -->

<%
	/* genero appositamente un errore per dimostrare il funzionamento dell'errorPage */
	//String test = null;
	//test.equals("");
%>

<section>
	<h1>Sono una JSP!</h1>
	<jsp:useBean id="articolo" class="it.corso.java.web.beans.Articolo" scope="request"></jsp:useBean>
	
	<p>
	<%
		articolo.getNome();
	%>
	</p>
</section>

<%@ include file="footer.jsp" %>
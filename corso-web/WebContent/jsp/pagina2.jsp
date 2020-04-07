<h1>2 - Titolo Pagina</h1>

<jsp:useBean id="articolo" class="it.corso.java.web.beans.Articolo" scope="request"></jsp:useBean>

<h2><%= articolo.getNome() %></h2>
<p>
	<%= articolo.getCodice() %><br>
	<%= articolo.getPrezzo() %>
</p>

<!-- corrisponde al set di una variabile -->
<jsp:setProperty property="nome" name="articolo" value="gioco di piscio"/>
<jsp:setProperty property="codice" name="articolo" value="564"/>
<jsp:setProperty property="prezzo" name="articolo" value="25"/>
<!-- corrisponde al get di una variabile -->
<h2><jsp:getProperty property="nome" name="articolo"/></h2>
<p>
	<jsp:getProperty property="codice" name="articolo"/><br>
	<jsp:getProperty property="prezzo" name="articolo"/>
</p>

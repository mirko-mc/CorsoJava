package it.corso.web.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/* - configurare BUILDPATH aggiungendo le dipendenze alla libreria tomEE
 * - estendiamo con la classe TAGSUPPORT
 * - override DOENDTAG
 * - creo tag di INPUT
 * - utilizziamo WRITER come se fossimo all'interno di una normale pagina JSP
 * - dichiaro il tag nel file TLD
 * - dichiaro le variabili degli attributi scelti nel file TLD
 * - creo GetterSetter
 * */
public class Input extends TagSupport {
	String nomeInput;
	String valoreInput;

	@Override
	public int doEndTag() throws JspException {
		String testo = "<input type=\"text\" name=\"" + getNomeInput() + "\" value=\"" + getValoreInput() + "\" class=\"mycss\" ";
		try {
			JspWriter writer = pageContext.getOut();
				writer.println(testo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}

	public String getNomeInput() {
		return nomeInput;
	}

	public void setNomeInput(String nomeInput) {
		this.nomeInput = nomeInput;
	}

	public String getValoreInput() {
		return valoreInput;
	}

	public void setValoreInput(String valoreInput) {
		this.valoreInput = valoreInput;
	}
}
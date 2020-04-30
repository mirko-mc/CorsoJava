package it.corso.jsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.diagram.Connection;
import org.primefaces.model.diagram.DefaultDiagramModel;
import org.primefaces.model.diagram.Element;
import org.primefaces.model.diagram.endpoint.DotEndPoint;
import org.primefaces.model.diagram.endpoint.EndPointAnchor;

@ManagedBean(name = "hello")
@RequestScoped
public class HelloBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* stiamo dicendo che questo attributo sarà associato ad un parametro che passeremo nella request */
	@ManagedProperty(value = "#{param.numero}")
	private String pagina;
	private String nome;
	private String biografia;
	private List<String> opzioni;
	private List<String> immagini;
	private BarChartModel barModel;
	private DefaultDiagramModel diagram;

	/* con PostConstruct diciamo che quando viene istanziato il bean viene invocato una sola volta il metodo init */
	@PostConstruct
	public void init() {
		opzioni = new ArrayList<String>();
		opzioni.add("Corso Java");
		opzioni.add("Corso JSF");
		opzioni.add("Corso PrimeFaces");
		opzioni.add("Corso JavaEE");
		
		immagini = new ArrayList<String>();
		immagini.add("free.jpg");
		immagini.add("chiocciola.jpg");
		immagini.add("free.jpg");
		immagini.add("chiocciola.jpg");
		immagini.add("free.jpg");
		immagini.add("chiocciola.jpg");
		
		/* CHART */
		barModel = new BarChartModel();
		/* chartseries > classe da utilizzare per le serie dei grafici a barre */
		ChartSeries s1 = new ChartSeries("Auto Vendute");
		s1.set("2014", 1548);
		s1.set("2015", 5421);
		s1.set("2016", 1548);
		s1.set("2017", 2456);
		s1.set("2018", 6548);
		s1.set("2019", 8542);
		ChartSeries s2 = new ChartSeries("Moto Vendute");
		s2.set("2014", 348);
		s2.set("2015", 621);
		s2.set("2016", 248);
		s2.set("2017", 456);
		s2.set("2018", 848);
		s2.set("2019", 142);
		barModel.addSeries(s1);
		barModel.addSeries(s2);
		barModel.setTitle("Confronto vendite auto/moto");
		Axis asseX = barModel.getAxis(AxisType.X);
		asseX.setLabel("Anni");
		Axis asseY = barModel.getAxis(AxisType.Y);
		asseY.setLabel("Vendite");
		
		/* DIAGRAM */
		diagram = new DefaultDiagramModel();
		/* impostiamo a -1 in modo da creare alberature abbastanza complesse */
		diagram.setMaxConnections(-1);
		/* creiamo oggetto per il nostro diagramma specificando testo e posizione */
		Element el1 = new Element("ele 1", "10em", "3em");
		/* aggiumgiamo il punto in cui è possibile connettere l'elemento */
		el1.addEndPoint(new DotEndPoint(EndPointAnchor.BOTTOM));
		/* setdraggable > definisce se gli elementi sono trascinabili */
		el1.setDraggable(true);
		/* il testo e la posizione si possono anche settare anzichè passarli come parametri */
//		el1.setTitle("ele 1");
//		el1.setX("10em");
//		el1.setY("3em");
		Element el2 = new Element("ele 2", "20em", "5em");
		el2.addEndPoint(new DotEndPoint(EndPointAnchor.BOTTOM));
		el2.setDraggable(true);
		diagram.addElement(el2);
		/* aggiungiamo l'elemento al diagramma */
		diagram.addElement(el1);
		Element el3 = new Element("ele 3", "10em", "20em");
		el3.addEndPoint(new DotEndPoint(EndPointAnchor.BOTTOM));
		el3.setDraggable(true);
		diagram.addElement(el3);
		Element el4 = new Element("ele 4", "15em", "10em");
		el4.addEndPoint(new DotEndPoint(EndPointAnchor.BOTTOM));
		el4.setDraggable(true);
		diagram.addElement(el4);
		/* connettiamo gli elementi tra loro */
		diagram.connect(new Connection(el1.getEndPoints().get(0), el2.getEndPoints().get(0)));
		diagram.connect(new Connection(el2.getEndPoints().get(0), el3.getEndPoints().get(0)));
		diagram.connect(new Connection(el1.getEndPoints().get(0), el4.getEndPoints().get(0)));
	}
	
	public String saluta() {
		/* il metodo invocato dalla pagina deve ritornare una stringa e la stringa deve puntare ad una pagina web
		 * altrimenti torneremo nella pagina di partenza
		 * */
		setBiografia("PAOLO BIO");

		/* la chiave è il valore associato alla variabile pagina 
		 * se pagina è diverso da null allora assegna pagina altrimenti assegna stringa vuota */
		switch (pagina != null ? pagina : "") {
		/* in tutti i casi entrerà nello switch, sia che pagina sia valorizzato sia che sia una stringa vuota */
		case "1":
			return "home1";
		case "2":
			return "home2";
		case "3":
			return "home2?faces-redirect=true";
		default:
			return "home";
		}

		/* navigazione implicita > nel return indichiamo la pagina di destinazione anche senza specificare l'estensione .xhtml. 
		 * 						   ritornerà la pagina indicata se la trova (la url rimarrà la stessa della pagina chiamante) altrimenti rimarrà nella pagina chiamante */
//		return "home2";
	}
	
	public void aggiorna() {
		/* questo metodo seguirà una logica che può essere il salvataggio dei dati di un bean */
	}
	
	public List<String> cerca(String query) {
		/* deve ritornare una lista di stringhe */
		List<String> res = new ArrayList<String>();
		if (query.equals("corso")) {
			res.add("Corso Java");
			res.add("Corso JSF");
			res.add("Corso PrimeFaces");
			res.add("Corso JavaEE");
		}
		return res;
	}

	
	
	/* GETTER SETTER */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	public List<String> getOpzioni() {
		return opzioni;
	}

	public void setOpzioni(List<String> opzioni) {
		this.opzioni = opzioni;
	}

	public List<String> getImmagini() {
		return immagini;
	}

	public void setImmagini(List<String> immagini) {
		this.immagini = immagini;
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	public void setBarModel(BarChartModel barModel) {
		this.barModel = barModel;
	}

	public DefaultDiagramModel getDiagram() {
		return diagram;
	}

	public void setDiagram(DefaultDiagramModel diagram) {
		this.diagram = diagram;
	}
}
package it.corso.java.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import it.corso.java.thread.concorrenza.GetSitePage;
import it.corso.java.thread.concorrenza.GetSitePageExecutor;
import it.corso.java.thread.concorrenza.GetSitePageForkJoin;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		
		try {
			m.esempioConcorrenzaThread();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			m.esempioConcorrenzaExecutor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		m.esempioConcorrenzaForkJoin();
	}
	
	private void esempioConcorrenzaForkJoin() {
		ForkJoinPool f = new ForkJoinPool();
		System.out.println("FORK BING " + f.invoke(new GetSitePageForkJoin("http://www.bing.it")));
		System.out.println("FORK GOOGLE " + f.invoke(new GetSitePageForkJoin("http://www.google.it")));
		f.shutdown();
	}
	
	public void esempioConcorrenzaExecutor() throws InterruptedException, ExecutionException {
		/* creiamo lista per i siti */
		List<Callable<String>> siti = new ArrayList<Callable<String>>();
		/* aggiungiamo i siti alla lista */
		siti.add(new GetSitePageExecutor("http://www.bing.it"));
		siti.add(new GetSitePageExecutor("http://www.google.it"));
		/* creiamo istanza executor */
		ExecutorService ex = Executors.newSingleThreadExecutor();
		/* facciamo partire i thread passando siti */
		List<Future<String>> out = ex.invokeAll(siti);
		/* per stampare l'output */
		System.out.println("EXECUTOR SERVICE");
		for (Future<String> future : out) {
			System.out.println(future.get());
		}
		/* una volta letto tutti gli output terminiamo executor service */
		ex.shutdown();
	}
	
	public void esempioConcorrenzaThread() throws InterruptedException {
		/* istanziamo 2 thread passando in ingresso URL */
		GetSitePage s1 = new GetSitePage("http://www.bing.it");
		GetSitePage s2 = new GetSitePage("http://www.google.it");
		/* avviamo i thread */
		s1.start();
		s2.start();
		/* attendiamo il completamento del thread */
		s1.join();
		s2.join();
		/* quando il thread è stato completato possiamo recuperare il contenuto */
		System.out.println("OUTPUT BING");
		System.out.println(s1.getContent());
		System.out.println("OUTPUT GOOGLE");
		System.out.println(s2.getContent());
	}
	
	private void esempioThread() {
		/* istanziamo direttamente la nostra classe
		 * */
		EsempioThread et = new EsempioThread();
		et.start();

		/* istanziamo la classe thread passando in ingresso l'istanza
		 * della nostra classe che implementa l'interfaccia runnable
		 * */
		Thread t = new Thread(new EsempioRunnable());
		t.start();

	}
	
	private void esempioMultiThread() {		
		EsempioThread et1 = new EsempioThread();
		et1.setName("T1");
		EsempioThread et2 = new EsempioThread();
		et2.setName("T2");
		EsempioThread et3 = new EsempioThread();
		et3.setName("T3");
		EsempioThread et4 = new EsempioThread();
		et4.setName("T4");
		EsempioThread et5 = new EsempioThread();
		et5.setName("T5");
		
		et1.start();
		et2.start();
		et3.start();
		et4.start();
		et5.start();
	}

}

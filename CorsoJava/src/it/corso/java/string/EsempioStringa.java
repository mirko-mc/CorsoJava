package it.corso.java.string;

public class EsempioStringa {
	public static void main(String[] args) {
		EsempioStringa es = new EsempioStringa();
		
		int oc = es.contaOccorrenze("lorem ipsum test prova Paolo", "m");
		
		System.out.println(oc);
		
		System.out.println(es.isPalindroma("affossoffa"));
	}
	
	public boolean isPalindroma(String str1) {
		String str2 = "";
		
		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 += str1.charAt(i);
		}

		return str1.equals(str2);
	}
	
	public int contaOccorrenze(String str1, String token) {
		int nOccorrenze = 0;
		
		for (int i = 0; i <= str1.length() - token.length(); i++) {
			String temp = str1.substring(i, i + token.length());
			if (temp.equals(token)) {
				nOccorrenze++;
			}
		}
		
		return nOccorrenze;
	}
}
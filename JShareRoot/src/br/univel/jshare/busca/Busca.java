package br.univel.jshare.busca;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Busca {
	
	public static void main(String[] args) {
		
		List<String> resultado = new ArrayList<>();
		
		String query = "nothing";
		
		Pattern pat = Pattern.compile(".*" + query + ".*");
		
		for (String nome : Lista.DADOS) {
			Matcher m = pat.matcher(nome.toLowerCase());
			if (m.matches()) {
				resultado.add(nome);
			}
		}
		
		for (String res : resultado) {
			System.out.println(res);
		}
		
		
		
	}

}

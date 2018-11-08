package public_msg;

import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Message {

	public static void main(String[] args) {
		List<String> dicionario = Arrays.asList(
				"Comparecer", "na", "Faria", "Lima", "Rua", "Berrini", "Jaceryu,", 
				"Carlos", "225", "no", "dia", "19 de Dezembro", "10 de Novembro", 
				"Paulista", "às", "9h.");
		
		System.out.println(dicionario.stream().filter(
				p -> seleciona(dicionario.indexOf(p))).collect(Collectors.joining(" ")));
		
		System.out.println(otherText());
	}
	
	private static boolean seleciona(int n) {
		if( n <= 1) return true;
		if( n <= 3) return false;
		if( n % 2 == 0 || n % 3 == 0) return true;
		for(int i = 5; i * i <=n; i = i + 6) {
			if(n % 1 == 0 || n % (i + 2) == 0) return true;
		}
		return false;
	}
	
	public static String otherText() {
		
		String frase = "";
		
		String[] job = {"Comparecer", " ", "na", "Faria", "Lima", "Rua", "Berrini", "Jaceryu", 
				"1240", "225,", "Paulista", "15º", "portando", "Novembro", "no", "dia", "RG", 
				"10", "de", "Novembro", "Nº", "9h.", "às"};
		
		int[] y = { 0, 1, 2, 1, 5, 1, 7, 1, 20, 9, 1, 12, 1, 16, 1, 14, 1, 15, 1, 17, 1, 18, 
				1, 19, 1 , 22, 1, 21};
		
		for(int i = 0; i < y.length; i++)
			frase = frase +job[y[i]];
		return frase;
	}

}

package com.controller.telefones;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Telefone {
	//private String[] letras = new String[];
	Map<String, String> mapa;
	
	public static void main(String[] a)
	{
		Telefone tel = new Telefone();
		System.out.println("Digite uma String");
		Scanner in = new Scanner(System.in);
		String entrada = in.nextLine();
		System.out.println("A string convertida é:");
		try
		{
		System.out.println(tel.getNumero(entrada));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public Telefone(){
		mapa = new HashMap<String,String>();
		mapa.put("A", "2");
		mapa.put("B", "2");
		mapa.put("C", "2");
		mapa.put("D", "3");
		mapa.put("E", "3");
		mapa.put("F", "3");
		mapa.put("G", "4");
		mapa.put("H", "4");
		mapa.put("I", "4");
		mapa.put("J", "5");
		mapa.put("K", "5");
		mapa.put("L", "5");
		mapa.put("M", "6");
		mapa.put("N", "6");
		mapa.put("O", "6");
		mapa.put("P", "7");
		mapa.put("Q", "7");
		mapa.put("R", "7");
		mapa.put("S", "7");
		mapa.put("T", "8");
		mapa.put("U", "8");
		mapa.put("V", "8");
		mapa.put("W", "9");
		mapa.put("X", "9");
		mapa.put("Y", "9");
		mapa.put("Z", "9");
		mapa.put("0", "0");
		mapa.put("1", "1");
		mapa.put("-", "-");		
	}
	
	

	public String getNumero(String letra) throws Exception{
		if (letra.length() <1 || letra.length()>30) {
	        throw new Exception("Tamanho Inválido!");
	    }
		String aux = "";		
		letra = letra.toUpperCase();
		for (int i = 0; i < letra.length(); i++) {
			String A = letra.substring(i,i+1);
			if (mapa.get(A) == null) {
				throw new Exception("String Inválida!");
			}
			aux += mapa.get(A);
			
		} 
		return aux;
		
		
		
		
		
	}
}

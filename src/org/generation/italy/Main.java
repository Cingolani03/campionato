package org.generation.italy;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String [] squadre= {"lazio","roma","inter","milan","napoli"};
		ArrayList<String> listaPartite=new ArrayList<>();
		ArrayList<Integer> punteggioCasa=new ArrayList<>();
		ArrayList<Integer> punteggioFuoricasa=new ArrayList<>();
		
		String casa,ospite,risposta;
		int punteggio1, punteggio2;
		
		do
		{
		do {
		System.out.println("inserisci il nome della squadra di casa");
		casa=sc.nextLine();
		if(casa.equals(squadre))
			System.out.println("inserisci la squadra ospite");
		else 
			System.out.println("la squadra inserita non è valida");
		
		ospite=sc.nextLine();
			if(ospite.equals(squadre))
			  System.out.println();
				else 
					 System.out.println("la squadra inserita non è valida");
		}while(!casa.equals(squadre)||!ospite.equals(squadre));
		
		listaPartite.add(casa + "-" + ospite);
		System.out.println("inserisci il risultato");

		punteggio1=Integer.parseInt(sc.nextLine()); 
		punteggio2=Integer.parseInt(sc.nextLine());
		
		punteggioCasa.add(punteggio1);
		punteggioFuoricasa.add(punteggio2);
		System.out.println("vuoi inserire un'altra partita ?");
		risposta=sc.nextLine();
		
		
		}while (risposta.equals("si"));
		
		for(int i=0;i<listaPartite.size();i++)
			System.out.println("le partite giocate sono: " + listaPartite.get(i) + " " + punteggioCasa.get(i) +"-" +punteggioFuoricasa.get(i));
	}

}

package main;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * created by Stefan
 */
public class Test 

{
	static Operatii o;
	static Scanner sc;
	static ArrayList<String> ar;
	public static void main(String[] args) 
	{
		
		sc = new Scanner( System.in );
		ar = new ArrayList();
		
		Menu m = new Menu();
		
		int ANGAJARE = m.add("Adaugati numele noului angajat.");
		int CONCEDIERE  = m.add("Concediati un angajat.");
		int ACTUALIZARE  = m.add("Schimbati informatiile unui angajat.");
		int AFISARE = m.add("Afisati lista cu angajati.");
		int EXIT = m.add("Exit");
		
		int op;
		op = -1;
		
		o = new Operatii();
		
		//Operatii o = new Operatii();
		
		while(op != EXIT)
		{
			m.show();
			System.out.println(" Please enter the coresponding number and then press enter");
			op = sc.nextInt();
			if(op == ANGAJARE)
			{
				o.angajeaza();
			}
			if(op == CONCEDIERE)
			{
				o.concediaza();
			}
			if(op == ACTUALIZARE)
			{
				o.actualizeaza();
			}
			if(op == AFISARE)
			{
				o.show();
				
				allowTheUserToReadTheResultScannerSolution();
			}
		}
	}
	public static void allowTheUserToReadTheResultScannerSolution()
	{
		System.out.println("Press Enter to continue");
		sc.nextLine();
		sc.nextLine();
	}
	
}

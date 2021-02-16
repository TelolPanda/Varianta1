package main;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * created by Stefan
 */
public class Operatii 
{	
	static ArrayList<String> ar = new ArrayList();
	static Scanner sc = new Scanner (System.in);
	
	public void angajeaza()
	{
		String employee;
		System.out.println("Introduceti noul angajat/a");
		employee = sc.nextLine();
		ar.add(employee);
		System.out.println(employee);
		System.out.println(employee + " a fost angajat");
	}
	public void concediaza()
	{
		String employee;
		System.out.println("Alege angajatul pe care vrei sa il concediezi");
		employee = sc.nextLine();
		if(ar.contains(employee))
		{
			ar.remove(employee);
			System.out.println("Angajatul " + employee + " a fost concediat");
		}
		else
		{
			System.out.println("Aceasta persoana nu este angajata");
			System.out.println("Verificati daca ati introdus gresit numele");
		}
	}
	public void actualizeaza()
	{
		String informatie;
		System.out.println("Alegeti informatia pe care vreti sa o schimbati");
		informatie = sc.nextLine();
		//ar.remove(informatie);
		String informatieNoua;
		System.out.println("Introduceti noua informatie");
		informatieNoua = sc.nextLine();
		//ar.add(informatieNoua);
		System.out.println("Noua lista arata in felul urmator : " + ar.toString().replace(informatie, informatieNoua).replace("[", "").replace("]", ""));
		
	}
	public void show()
	{
		System.out.println("Lista angajatilor este " + ar.toString().replace("[", "").replace("]", ""));
	}
}

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
	
	public static Person  angajeaza()
	{
		Person p = new Person();
		System.out.println("Introduceti numele");
		p.setFullName(sc.nextLine());
		
		System.out.println("Introduceti sexul");
		p.setGender(sc.nextLine());
		
		System.out.println("Introduceti data nasterii");
		p.setDateOfBirth(sc.nextLine());
		
		System.out.println("Introduceti numarul de telefon");
		p.setPhoneNumber(sc.nextLine());
		
		return p;
		
	}
	
//	public void concediaza()
//	{
		//String employee;
		//System.out.println("Alege angajatul pe care vrei sa il concediezi");
	//	employee = sc.nextLine();
		//if(ar.contains(employee))
	//	{
	//		ar.remove(employee);
	//		System.out.println("Angajatul " + employee + " a fost concediat");
	//	}
		//else
	//	{
		//	System.out.println("Aceasta persoana nu este angajata");
		//	System.out.println("Verificati daca ati introdus gresit numele");
		//}
//	}
	//public void actualizeaza()
	//{
	//	String informatie;
	//	System.out.println("Alegeti informatia pe care vreti sa o schimbati");
	//	informatie = sc.nextLine();
	//	//ar.remove(informatie);
	//	String informatieNoua;
	//	System.out.println("Introduceti noua informatie");
		//informatieNoua = sc.nextLine();
		//ar.add(informatieNoua);
		
		
	//}
	public void show()
	{
		System.out.println("Lista angajatilor este " + ar.toString().replace("[", "").replace("]", ""));
	}
}

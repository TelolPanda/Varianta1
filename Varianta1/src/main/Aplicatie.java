package main;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * created by Stefan
 */
public class Aplicatie 
{
	static Scanner sc;
	static ArrayList<Person>ar;
	
	public static void main(String[] args) 
	{
		
		Menu m = new Menu();
		
		int ANGAJARE = m.add("Adaugati noul angajat.");
		int CONCEDIERE  = m.add("Concediati un angajat.");
		int ACTUALIZARE  = m.add("Schimbati informatiile unui angajat.");
		int AFISARE = m.add("Afisati lista cu angajati.");
		int EXIT = m.add("Exit");
		
		int op;
		op = 0;
		sc = new Scanner( System.in );
		ar = new ArrayList();
		
		Person p;
		while(op != EXIT)
		{
			m.show();
			op = sc.nextInt();
			if(op == ANGAJARE)
			{
				p = new Person();
				
				System.out.println("Introduceti numele");
				sc.nextLine();
				p.setFullName(sc.nextLine());
				
				System.out.println("Introduceti sexul");
				p.setGender(sc.nextLine());
															
				System.out.println("Introduceti data nasterii");
				p.setDateOfBirth(sc.nextLine());
				
				System.out.println("Introduceti numarul de telefon");
				p.setPhoneNumber(sc.nextLine());
				System.out.println(p);
				ar.add(p);
			}
			if(op == CONCEDIERE)
			{
				String nume;
				sc.nextLine();
				nume = sc.nextLine();
				
				int poz = -1;
				for(int i=0;i<ar.size() && poz==-1;i++)
				{
					if(nume.equals(ar.get(i).getFullName() ) )
					{
						poz = i;
					}
					else
					{
						System.out.println("Aceasta persoana nu se afla in lista angajatilor, verificati daca ati introdus gresit numele.");
					}
				}
				
				if(poz > -1)
				{
					ar.remove( poz );
				}
			}
			if(op == ACTUALIZARE)
			{
				String name;
				sc.nextLine();
				name = sc.nextLine();
				for(int i =0;i<ar.size();i++)
				{
					if(name.equals(ar.get(i).getFullName()))
					{	
						p = ar.get(i);
				int o;
				o = sc.nextInt();
				if(o == 1)
				{
					sc.nextLine();
					p.setFullName(sc.nextLine());
				}
				if(o == 2)
				{
					p.setGender(sc.nextLine());
				}
				if(o == 3)
				{
					sc.nextLine();
					p.setDateOfBirth(sc.nextLine());
				}
				if(o == 4)
				{
					sc.nextLine();
					p.setPhoneNumber(sc.nextLine());
				}
			}
		}
			}
			if(op == AFISARE)
			{
				int i;
				int n;
				n = ar.size();
				for(i=0;i<n;i++)
				{
					System.out.println(ar.get(i));
				}
				
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

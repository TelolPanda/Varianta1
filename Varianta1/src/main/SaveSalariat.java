package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * Tudor Andrei Gioroc
 * 2021-02-16
 */
public class SaveSalariat
{
	
		private static void saveSalariat(String nume, String prenume, int ziNastere, String lunaNastere, int anNastere, String gender, long nrTel, String pozitie, String departament, int ziAngajare, String lunaAngajare, int anAngajare, long salariu) 
		{
			System.out.println();
			
			try (PrintWriter pw = new PrintWriter(new FileWriter("Save Salariat", true)))
			{	
			pw.println("Nume:" + nume);
			pw.println("Prenume:" + prenume);
			pw.println("Ziua nasterii:" + ziNastere);
			pw.println("Luna nasterii:" + lunaNastere);
			pw.println("Anul nasterii:" + anNastere);
			pw.println("Sexul:" + gender);
			pw.println("Numar de telefon:" + nrTel);
			pw.println("Pozitie:" + pozitie);
			pw.println("Departament:" + departament);
			pw.println("An angajare:" + ziAngajare);
			pw.println("Luna angajarii:" + lunaAngajare);
			pw.println("Anul angajarii:" + anAngajare);
			pw.println("Salariu:" + salariu);
			
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
		public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Introdu numele persoanei");
			String nume;
			nume = scanner.nextLine();
			System.out.println("Introdu prenumele persoanei");
			String prenume;
			prenume = scanner.nextLine();
			System.out.println("Care este ziua nasterii lui " + prenume + " " + nume);
			int ziNastere;
			ziNastere = scanner.nextInt();
			System.out.println("Care este luna nasterii lui " + prenume + " " + nume);
			String lunaNastere;
			lunaNastere = scanner.nextLine();
			System.out.println("Care este anul nasterii lui " + prenume + " " + nume);
			int anNastere;
			anNastere = scanner.nextInt();
			System.out.println("Care este sexul lui " + prenume + " " + nume);
			String gender;
			gender = scanner.nextLine();
			System.out.println("Care este numarul de telefon a lui " + prenume + " " + nume);
			long nrTel;
			nrTel = scanner.nextLong();
			System.out.println("Care este pozitia lui " + prenume + " " + nume);
			String pozitie;
			pozitie = scanner.nextLine();
			System.out.println("Care este departamentul unde " + prenume + " " + nume + " lucreaza");
			String departament;
			departament = scanner.nextLine();
			System.out.println("Care este prenumele superiorului lui " + prenume + " " + nume);
			String superiorPrenume;
			superiorPrenume = scanner.nextLine();
			System.out.println("Care este numele superiorului lui " + prenume + " " + nume);
			String superiorNume;
			superiorNume = scanner.nextLine();
			System.out.println("Care este ziua de nastere superiorului lui " + prenume + " " + nume);
			int superiorZiNastere;
			superiorZiNastere = scanner.nextInt();
			System.out.println("Care este luna de nastere superiorului lui " + prenume + " " + nume);
			int superiorLunaNastere;
			superiorLunaNastere = scanner.nextInt();
			System.out.println("Care este anul de nastere superiorului lui " + prenume + " " + nume);
			int superiorAnNastere;
			superiorAnNastere = scanner.nextInt();
			System.out.println("Care este ziua angajarii lui " + prenume + " " + nume);
			int ziAngajare;
			ziAngajare = scanner.nextInt();
			System.out.println("Care este luna angajarii lui " + prenume + " " + nume);
			String lunaAngajare;
			lunaAngajare = scanner.nextLine();
			System.out.println("Care este anul angajarii lui " + prenume + " " + nume);
			int anAngajare;
			anAngajare = scanner.nextInt();
			System.out.println("Care este salariul lui " + prenume + " " + nume);
			long salariu;
			salariu = scanner.nextLong();
			saveSalariat(nume, prenume, ziNastere, lunaNastere, anNastere, gender, nrTel, pozitie, departament, ziAngajare, lunaAngajare, anAngajare, salariu);
		}
}

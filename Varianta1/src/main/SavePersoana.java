package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * Tudor Andrei Gioroc
 * 2021-02-16
 */
public class SavePersoana 
{
	
		private static void savePersoana(String nume, String prenume, int ziNastere, String lunaNastere, int anNastere, String gender, long nrTel) 
		{
			System.out.println();
			
			try (PrintWriter pw = new PrintWriter(new FileWriter("Save Persoana", true)))
			{	
			pw.println("Nume:" + nume);
			pw.println("Prenume:" + prenume);
			pw.println("Ziua nasterii:" + ziNastere);
			pw.println("Luna nasterii:" + lunaNastere);
			pw.println("Anul nasterii:" + anNastere);
			pw.println("Sexul:" + gender);
			pw.println("Numar de telefon:" + nrTel);		
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

			savePersoana(nume, prenume, ziNastere, lunaNastere, anNastere, gender, nrTel);
		}
}

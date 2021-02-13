package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu 
{

	List<String> m = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	int id;
	
	public int add(String option)
	{		
		id ++;
		
		m.add( id + ". " + option );
		
		return id;
	}
	
	public void show()
	{
		
		System.out.println(m.get(0));
	}
		
	
	
	public int getOption()
	{
		int op;
		
		op = sc.nextInt();
		
		return op;
	}
}

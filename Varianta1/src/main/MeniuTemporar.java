package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeniuTemporar 
{
	List<String> m = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	int id;
	
	public void show()
	{
		 for(int i=0;i<m.size();i++)
	        {
	            System.out.println(m.get(i));
	        }
	}
	public int getOption()
	{
		int op;
		
		op = sc.nextInt();
		
		return op;
	}
	public int add(String option)
	{		
		id ++;
		
		m.add( id + ". " + option );
		
		return id;
	}
	
	
}

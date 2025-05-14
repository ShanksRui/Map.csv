package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entities.Employe;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	List<Employe> list = new ArrayList<>();
	
	System.out.print("Enter the full file path");
	String path = sc.nextLine();
	System.out.print("enter salary");
        Double salary = Double.parseDouble(sc.nextLine());
    
	try(BufferedReader br = new BufferedReader(new FileReader(path))){
		String line;
		while((line = br.readLine())!= null) {
			String[] file = line.split(",");
		    list.add(new Employe(file[0], file[1], Double.parseDouble(file[2])));			
		}
	   System.out.println("Email of people whose salary is more than 2000.00");
	   List<Employe> filter = list.stream().filter(p -> p.getSalary() > salary).collect(Collectors.toList());
	   filter.sort((p1,p2) -> p1.getEmail().toUpperCase().compareTo(p2.getEmail().toUpperCase()));
	   for(Employe x: filter) {
		   System.out.println(x.toString());
	   }
	   
	 List<Employe> filterSum = list.stream().filter(p -> p.getName().charAt(0) == 'M').collect(Collectors.toList());
	 Double sum =  filterSum.stream().map(p -> p.getSalary()).reduce(0.0, (x1,x2) -> x1 + x2);
	 System.out.println(sum);
	}catch(IOException e ) {
		System.out.println("error:" +e.getCause());
	}

		
	
		
	}

}

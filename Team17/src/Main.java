import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Aitisi> aitiseis = new ArrayList<Aitisi>();
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Create User");
		System.out.println("Type what kind of user you are: (Kathigitis, Grammateia, Proedros, Taktika Melh)");
		String type = scan.nextLine();
		
		System.out.println("Give Name");
		String name = scan.nextLine();
		
		if(type.equals("Kathigitis")){
			System.out.println("Submit Application");
		
			System.out.println("Give Date");
			String date = scan.nextLine();
			int ID = 1;
			
			Aitisi aitisi = new Aitisi(ID, name, date, false);
			aitiseis.add(aitisi);
			
		}
		else {
			System.out.println("The Application will be assesed");
		}
		
		
		
		
		
	}

}

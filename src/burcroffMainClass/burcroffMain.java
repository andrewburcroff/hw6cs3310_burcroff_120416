package burcroffMainClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import burcroffHash.hashTable;
import burcroffHash.hashTableEntry;

public class burcroffMain {

	/**
	 * This is my main Method will ask the user
	 */
	public static void main(String[] args) {
		hashTable burcroff = new hashTable();
		Scanner kb = new Scanner(System.in);
		while(true){
			System.out.println("These are your options:");
			System.out.println("Enter 1 to insert a name");
			System.out.println("Enter 2 to search a name");
			System.out.println("Enter 3 to delete a name");
			System.out.println("Enter 4 to show the names");
			System.out.println("Enter 5 to exit");
			int answer = Integer.valueOf(kb.nextLine());
		if (answer == 1){
			System.out.println("Please input the name to be inputed:");
			String add = kb.nextLine();
			burcroff.insert(add);			
		}
		else if(answer == 2){
			System.out.println("What hashCode are you seaching for:");
			int ser = Integer.valueOf(kb.nextLine());
			burcroff.search(ser);
			
		}
		else if(answer == 3){
			System.out.println("Please input the name to be deleted:");
			String remove = kb.nextLine();
			burcroff.delete(remove);
		}
		else if(answer == 4){
			System.out.println("This is your hashTable:");
			burcroff.show();
		}
		
		else if(answer == 5){
			System.out.println("Your exiting the my Hash Table Program");
			System.exit(0);
		}
	}
	}
}

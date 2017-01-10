package burcroffHash;

import burcroffHash.hashTableEntry;
import java.util.ArrayList;

public class hashTable {

	ArrayList<hashTableEntry> eneries;//Setting the constructor of eneries.
	
	
	public hashTable(){
		eneries = new ArrayList<hashTableEntry> ();
	}
	/*
	 * This method will insert a given name to a arraylist whether 
	 * a name already exists or it needs to be added on the end.
	 */
	
	public void insert(String name){
		int j = calculate(name);//setting j equal to the calcualate method of parameter of name
		int index = search(j);
		System.out.println("index == " + index);
		if(index == -1){
			hashTableEntry newEntry = new hashTableEntry();//Creating a new table called entry
			newEntry.hashvalue = j;//Setting the new entry of the hashavalue to the j
			newEntry.names.add(name);//Adding the name of hash value to j
			eneries.add(newEntry);//Adding the new entry to the eneries of arraylist
		}
		else{
			eneries.get(index).names.add(name);//adds the name for the certain value that needs to be replaced
		}
	}
	
	/*
	 * This method will get the hash value with the with a 
	 * parameter of a string. 
	 */
	
	public int calculate(String s){
		char ch[];//Intailize a char
		ch = s.toCharArray();//Setting the char to the string as a parameter
		int i, sum;//intailize int i and sum.
		for (sum=0, i=0; i < s.length(); i++){
		    sum = sum^s.charAt(i);//calculate the hash value 
		  }
		  return sum;//return the sum value
	}
	
	/*
	 * This method will search the arraylist and find a certian
	 * value if it is there. If found then it will get the value.
	 * If not found, it will return -1 or null.
	 */
	
	public int search(int t){
		System.out.println("t == " + t);
		for (int i =0; i < eneries.size();i ++){
			System.out.println("hashvalue == " + eneries.get(i).hashvalue);
			if(eneries.get(i).hashvalue==t)//it will get the value of the hash value is equal to t the parameter
			{
				System.out.println("found!");
				return i;//return the i
			}
		}
		return -1;//return -1 if not found
	}
	
	/*
	 * This method will delete a ceratin element of a string value. 
	 * It will remove the string.
	 */
	
	public void delete(String a){
		int t;//intailize j
		t = calculate(a);//setting the t to calculate of a the parameter passed in.
		if(search(t) != -1){
			eneries.get(search(t)).names.remove(a);//the eneries to search of t get the naems and remove them
		}
	}
	
	/*
	 * This method will show the arraylist called eneries for every
	 * element in the arraylist.
	 */
	
	public void show(){
		for (int i =0; i < eneries.size();i ++){
			hashTableEntry element = eneries.get(i);
			System.out.println(element.hashvalue + ": " + element.names);//prints out the hashcode and elements names
		}
	}
}
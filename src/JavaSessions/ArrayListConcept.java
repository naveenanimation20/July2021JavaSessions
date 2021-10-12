package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList -- Default class
		// dynamic array
		// size is not fixed
		// index based -- maintains the order
		// create the object of the ArrayList class

		ArrayList ar = new ArrayList();
		System.out.println(ar.size());// pc = 0

		ar.add(100);// 0
		ar.add(200);// 1
		ar.add(300);// 2

		System.out.println(ar.size());// 3

		ar.add(400);// 3
		ar.add(500);// 4

		System.out.println(ar.size());// 5

		ar.add(400);// 5
		ar.add(500);// 6

		System.out.println(ar.size());// 7

		ar.remove(3);
		System.out.println(ar.get(3));
		System.out.println(ar.size());// 6

		// to print all the values from arraylist: for loop: O(n)
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ar.add("testing");
		ar.add(12.33);
		ar.add(true);
		ar.add('F');

		for (Object e : ar) {
			System.out.println(e);
		}

		// Generics in Java
		// AR -- names (String)
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tanu");
		empList.add("Tom");

		for (String e : empList) {
			System.out.println(e);
		}

		ArrayList<Integer> empNumber = new ArrayList<Integer>();
		empNumber.add(100);
		empNumber.add(200);

		for (Integer e : empNumber) {
			System.out.println(e);
		}

		// AR -- emp data --> String, int, double, true, char
		ArrayList<Object> empData = new ArrayList<Object>(5);
		empData.add("Lisa");
		empData.add(30);
		empData.add(34.55);
		empData.add(true);
		empData.add('F');

		for (Object e : empData) {
			System.out.println(e);
		}

		System.out.println(empData);

		for (int i = 0; i < empData.size(); i++) {
			System.out.println(empData.get(i));

			if (empData.get(i).equals("Lisa")) {
				System.out.println("emp name is lisa");
				break;
			}

		}

		// use cases in selenium:
		// 10 links on the page
		// collect all 10 links in an arraylist
		// start a loop:
		// if(ele.text().equals('amazon')
		// click()
		// break;

		// drop down selection:
		// 20 elements/options are there
		// collect all 20 values in arraylist
		// start a loop:
		// if(ele.text().equals('India')
		// select the value
		// break;

		ArrayList<String> namesList = new ArrayList<String>();

		namesList.add("Tom");
		namesList.add("Lisa");
		namesList.add("Pter");
		namesList.add(namesList.size(),"naveen");//last position
		namesList.add(namesList.size()-namesList.size(),"Robby");//first position
		System.out.println(namesList);
		
		//
		ArrayList<String> product = new ArrayList<String>();
		product.add("Macbook");//0
		product.add("Samsung");//1
		
		System.out.println(product.get(0));
		System.out.println(product.get(1));
		//System.out.println(product.get(2));//IndexOutOfBoundsException

		
		
		
		
		
		

	}

}

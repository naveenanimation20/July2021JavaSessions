package ConstructorConcept;

import java.util.ArrayList;

public class TestUni {

	public static void main(String[] args) {

		ArrayList<String> delhiUniCourseList = new ArrayList<String>();
		delhiUniCourseList.add("Physics");
		delhiUniCourseList.add("Chemistry");
		delhiUniCourseList.add("Bio");

		Uni u1 = new Uni("Delhi Uni", "New Delhi", delhiUniCourseList);

		System.out.println(u1.getName() + " " + u1.getHq());

		System.out.println(u1.getCourseList());

		u1.setHq("Pune");

		System.out.println(u1.getName() + " " + u1.getHq());

	}

}

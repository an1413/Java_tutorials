package org.opentutorials.condition;

public class Id_Password {

	public static void main(String[] args) {
		String id = args[0];
		String Password = args[1];
		
		if(id.equals("nastar") && Password.equals("990428"))  {
			System.out.println("Right");
		}
		else {
			System.out.println("Wrong");
		}
	}

}

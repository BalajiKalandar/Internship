package com.java.FlipRoboAssignment3;

class Example {
	private int number;
	private String name;

// Getter Method
public String getName() {
    return name;   
}
public double getNumber() {
	return number;
}
//Setter Method
public void setName(String newName) {
    this.name = newName;
   
  }
public void setNumber(int newNumber) {
	this.number=newNumber;
}

public void printDetails() {
	System.out.println("Name: "+ name);
	System.out.println("Number: "+ number);
	
}

public class Demo {
	public static void main(String[] args) {
		Example ref= new Example();
		ref.name="Balaji";
		ref.number=123;
		ref.printDetails();
	}

}
}
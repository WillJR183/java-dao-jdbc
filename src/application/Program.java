package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department d = new Department(1, "Games");
		Seller s = new Seller(210, "Test Test", "test@gmail.com", new Date(), 3500.0, d);
		
		System.out.println(s);
		
	}

}
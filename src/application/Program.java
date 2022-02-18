package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department d = new Department(1, "Games");
		Seller s = new Seller(210, "Test Test", "test@gmail.com", new Date(), 3500.0, d);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	
		System.out.println(s);
		
	}

}
package application;

import java.sql.Date;

import model.Department;
import model.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(0), 3000.00, obj);
		
		System.out.println(seller);

	}

}

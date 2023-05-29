package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Pencil");
		
		Seller seller = new Seller(45,"Fulano", "fulano@mail.com",new Date(),3000.0,obj);
		System.out.println(seller);
	}

}

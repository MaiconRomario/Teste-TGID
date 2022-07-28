package application;

import entities.Product;
import entities.Sales;
import entities.SalesItem;
import entities.User;

public class Program {

	public static void main(String[] args) {
		User user = new User("João da Silva", 123456789L, "joaogmail.com", 999999999L);
		Product product = new Product("Computer", 7500.99, 1, new Sales(123), new SalesItem(85));
		
		System.out.println("Client: ");
		System.out.println("Name: " + user.getName());
		System.out.println("CPf: " + user.getCpf());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Phone: " + user.getPhone());
		
		System.out.println();
		System.out.println(product);
	}

}

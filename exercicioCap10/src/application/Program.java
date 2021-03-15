package application;

import java.text.ParseException;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Room [] vect = new Room[10];
		
		
		System.out.println("How many rooms will be rented: ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Rent #: " + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int nrRoom = sc.nextInt();
			
			vect[nrRoom] = new Room(name, email);
		}
		
		
		System.out.println("Busy Rooms: ");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect [i]);
			}
		}
		
		sc.close();
	}

}

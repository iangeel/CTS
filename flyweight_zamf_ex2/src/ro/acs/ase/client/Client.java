package ro.acs.ase.client;

import ro.acs.ase.models.FlyweightFactory;
import ro.acs.ase.models.IRoom;
import ro.acs.ase.models.Room;
import ro.acs.ase.models.Temporals;

public class Client {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Temporals temp1 = new Temporals(101, "Gigel Frone");
		Temporals temp2 = new Temporals(202, "Vasile Leustean");
		
		IRoom room1 = new Room(2, 2);
		IRoom room2 = new Room(4, 2);
		
		room1.tipareste(temp1);
		room2.tipareste(temp2);
		
		factory.getRoom(0).tipareste(temp1);;
	}

}

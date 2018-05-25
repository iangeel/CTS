package ro.acs.ase.models;

import java.util.ArrayList;
import java.util.List;

public class FlyweightFactory {

	private List<IRoom> mRooms;
	
	public FlyweightFactory() {
		this.mRooms = new ArrayList<>();
	}
	
	public IRoom getRoom(int index) {
		IRoom room = new Room(6, 3);
		mRooms.add(room);
		return room;
	}
}

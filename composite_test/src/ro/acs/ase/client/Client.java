package ro.acs.ase.client;

import ro.acs.ase.model.Coach;
import ro.acs.ase.model.Manager;
import ro.acs.ase.model.Medic;
import ro.acs.ase.model.Player;
import ro.acs.ase.model.Scouter;

public class Client {

	public static void main(String[] args) {
		Manager manager = new Manager("Popescu the MANAGER");
		Coach coach = new Coach("Gigel the mighty Coach");
		Coach coach2 = new Coach("Zidaneeee");
		
		Medic medic = new Medic("Aristotel");
		Scouter scouter = new Scouter("Hippo the Scouter");
		Player player = new Player("Maradona din Carpati");
		
		Medic medic2 = new Medic("Herodot");
		Player player2 = new Player("Hagi din Argentina");
		

		manager.addEmplyee(coach);
		manager.addEmplyee(coach2);
		
		coach.addEmplyee(medic);
		coach.addEmplyee(scouter);
		coach.addEmplyee(player);
		
		coach2.addEmplyee(medic2);
		coach2.addEmplyee(player2);
		
		manager.showTeam();
	}

}

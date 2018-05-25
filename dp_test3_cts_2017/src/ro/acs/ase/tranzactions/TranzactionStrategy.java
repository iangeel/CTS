package ro.acs.ase.tranzactions;

import ro.acs.ase.models.Imobil;

public interface TranzactionStrategy {
	void doTranzaction(Imobil imobil);
}

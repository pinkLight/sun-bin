package filmore.services;

import filmore.model.CompteClient;

public  interface CompteClientService {

	
	public  void registerCompteClient(CompteClient compteClient);
	public CompteClient getCompteClient(int id);
}

package filmore.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filmore.model.CompteClient;
import filmore.model.dao.CompteClientDao;
import filmore.model.impl.CompteClientImpl;
import filmore.services.CompteClientService;

@Service("compteClientService")
public class CompteClientServiceImpl implements CompteClientService{
	
	@Autowired
	private CompteClientDao compteClientDao;
	
	public void setCompteClientDao(CompteClientDao compteClientDao) {
		this.compteClientDao = compteClientDao;
	}

	
	public void registerCompteClient(CompteClient compteClient) {
		compteClientDao.create(compteClient);
		
	}

	public CompteClient getCompteClient(int id) {
		CompteClientImpl result =(CompteClientImpl) compteClientDao.find(id);
		return (CompteClient)result;
	}

}

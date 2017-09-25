package filmore.model.dao.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import filmore.model.CompteClient;
import filmore.model.dao.CompteClientDao;
import filmore.model.impl.CompteClientImpl;

public class TestCompteClientDao {

	@Autowired
	private CompteClientDao compteClientDao;
	
	@Test
	@Transactional
	@Rollback(true)
	public void testAddCompteClient() {
		CompteClient compteClient= new CompteClientImpl();
		compteClient.setLastname("durand");
		compteClient.setFirstname("georges");
		compteClient.setAddress("8 rue de la liberté");
		compteClient.setZipCode(75001);
		compteClient.setCity("Paris");
		compteClient.setCountry("France");
		compteClient.setPassword("1234LOJde");
		compteClientDao.create(compteClient);
		List<CompteClient> compteClients = compteClientDao.findAll();
		CompteClient retrievedCompteClient = compteClients.get(0);
		Assert.assertEquals(retrievedCompteClient.getLastname(),compteClient.getLastname()); 
	}
	
}

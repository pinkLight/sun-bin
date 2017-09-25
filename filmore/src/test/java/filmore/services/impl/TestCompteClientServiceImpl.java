package filmore.services.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import filmore.model.CompteClient;
import filmore.model.impl.CompteClientImpl;
import filmore.services.CompteClientService;


@ContextConfiguration(locations={"/test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners(DependencyInjectionTestExecutionListener.class)
public class TestCompteClientServiceImpl {
	
	@Autowired
	private CompteClientService compteClientService;
	
	@Test
	@Transactional
	@Rollback(true)
	public void testSuccess() {
		CompteClient compteClient= new CompteClientImpl();
		compteClient.setLastname("durand");
		compteClient.setFirstname("georges");
		compteClient.setAddress("8 rue de la liberté");
		compteClient.setZipCode(75001);
		compteClient.setCity("Paris");
		compteClient.setCountry("France");
		compteClient.setPassword("1234LOJde");
		compteClientService.registerCompteClient(compteClient);
		Assert.assertTrue(true);
		
	}

	public void setCompteClientService(CompteClientService compteClientService) {
		this.compteClientService = compteClientService;
	}

	public void testFail() {
		
	}
}


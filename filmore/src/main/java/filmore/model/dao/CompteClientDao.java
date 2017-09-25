package filmore.model.dao;

import java.util.List;

import filmore.model.CompteClient;

public interface CompteClientDao  {
	
	
	public void create(CompteClient c);
	public void delete(Integer id);
	public CompteClient update(CompteClient c);
	public CompteClient find(Integer id) ;
	public List<CompteClient> findAll();
	
	List<CompteClient> getCompteClientsByLastName(String lastname);
	CompteClient getCompteClientsByLastNameAndFirstName(String lastname, String firstname);
	
	
	
	
}

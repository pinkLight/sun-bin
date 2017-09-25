package filmore.model.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import filmore.model.CompteClient;
import filmore.model.dao.CompteClientDao;

@Repository
public class CompteClientDaoImpl implements CompteClientDao{

	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	CompteClientDaoImpl(){
		
	}

	
	public void create(CompteClient c) {
		String query="INSERT INTO Clients values('";
		query+=c.getFirstname()+"', '";
		query+=c.getLastname()+"','";
		query+=c.getPassword()+"', '";
		query+=c.getEmailAddress()+"', '";
		query+=c.getAddress()+"', ";
		query+=c.getZipCode()+", '";
		query+=c.getCity()+"', '";
		query+=c.getCountry();
		query+="',0);";
		jdbcTemplate.execute(query);
		
	}

	
	public void delete(Integer id) {
		String query="DELETE * FROM Client where id="+id;
		jdbcTemplate.execute(query);
		
	}

	
	public CompteClient update(CompteClient t) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public CompteClient find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<CompteClient> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<CompteClient> getCompteClientsByLastName(String lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public CompteClient getCompteClientsByLastNameAndFirstName(String lastname, String firstname) {
		// TODO Auto-generated method stub
		return null;
	}
}

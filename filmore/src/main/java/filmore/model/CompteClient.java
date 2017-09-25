package filmore.model;

public interface CompteClient {

	public void acheterMedia(Integer idMedia);
	
	public String getLastname();
	public void setLastname(String lastname);
	public String getFirstname();
	public void setFirstname(String firstname);
	public String getAddress();
	public void setAddress(String address);
	public Integer getZipCode();
	public void setZipCode(Integer zipCode);
	public String getCity();
	public void setCity(String city);
	public String getCountry() ;
	public void setCountry(String country);
	public String getEmailAddress();
	public void setEmailAddress(String emailAddress);
	public String getPassword();
	public void setPassword(String password);
	public Boolean isBlocked();
	public void setBlocked(Boolean blocked);
}

package filmore.controllers.home;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import filmore.model.CompteClient;
import filmore.model.impl.CompteClientImpl;
import filmore.services.CompteClientService;

@Controller
public class HomeController {

	 @Autowired
	 private CompteClientService compteClientService;
	
	@RequestMapping(value = { "/home", "/" })
	public String renderHomePage(ModelMap model) {
        return "home";
    }
	
	@RequestMapping(value = { "/createAccount" })
	public String renderAccount(ModelMap model) {
        return "createAccount";
    }
	
	@RequestMapping(value = { "/submitCreateAccount" })
	public String createAccount(Model model, HttpServletRequest request) {
		
		CompteClient compteClient = new CompteClientImpl();
		
		compteClient.setLastname(request.getParameter("lastname"));
		compteClient.setFirstname(request.getParameter("firstname"));
		compteClient.setEmailAddress(request.getParameter("emailAddress"));
		compteClient.setPassword(request.getParameter("password"));
		compteClient.setAddress(request.getParameter("address"));
		compteClient.setZipCode(Integer.parseInt(request.getParameter("zipCode")));
		compteClient.setCity(request.getParameter("city"));
		compteClient.setCountry(request.getParameter("country"));
		compteClient.setBlocked(false);
		compteClientService.registerCompteClient(compteClient);
        return "confirmCreateAccount";
    }
	
	
	
}

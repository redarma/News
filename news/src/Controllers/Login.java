/**
 * 
 */
package Controllers;

import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;



import org.primefaces.context.RequestContext;

import DAO.CuentaDAO;
 
@ManagedBean(name="Login")
@SessionScoped
public class Login {
	
    private String username;
    private String password;
    
	public String getPassword() {
        return password;
    }
	public String getUsername() {
        return username;
    }
 
	
	
    public void setUsername(String username) {
        this.username = username;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
   
	
	public void login(ActionEvent event) throws SQLException {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
        CuentaDAO login = new CuentaDAO(); 
    	boolean result = login.login(username, password);
    	
        if(result) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
    }   
 
}

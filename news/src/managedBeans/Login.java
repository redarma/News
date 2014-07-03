package managedBeans;

import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import DAO.CuentaDAO;
public class Login
{
    private String username;  

    private String password;  

    public String getUsername() {  
        return username;  
    }  

    public void setUsername(String username) {  
        this.username = username;  
    }  

    public String getPassword() {  
        return password;  
    }  

    public void setPassword(String password) {  
        this.password = password;  
    }  

    public void login(ActionEvent actionEvent) throws SQLException {  
        RequestContext context = RequestContext.getCurrentInstance();  
        FacesMessage msg = null;  
        boolean loggedIn = false;  
        CuentaDAO login = new CuentaDAO(); 
    	loggedIn = login.login(username, password);
        if(loggedIn) {  
            loggedIn = true;  
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", username);  
        } else {  
            loggedIn = false;  
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error de Sesion", "Credenciales Invalidas");  
        }  

        FacesContext.getCurrentInstance().addMessage(null, msg);  
        context.addCallbackParam("loggedIn", loggedIn);  
    }  
}
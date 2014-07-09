package Com.Candidjava;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import Beans.UsuarioBean;
import DAO.CuentaDAO;

import com.sun.net.httpserver.Authenticator.Failure;
import com.sun.net.httpserver.Authenticator.Success;

public class LoginAction extends Action{
	private static  String SUCCESS="failure";
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		LoginForm loginForm =(LoginForm)form;
		String user= loginForm.getUserName();
		String pass= loginForm.getPassword();
		CuentaDAO dao= new CuentaDAO();
		UsuarioBean us= new UsuarioBean();
		Boolean logueado= dao.login(user, pass);
		  SUCCESS=(logueado)?"success":"failure";
		return mapping.findForward(SUCCESS);
	}

}

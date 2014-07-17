package Com.Candidjava;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import DAO.DUsuario;

public class LoginAction extends Action{
	private static  String SUCCESS="success";
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		LoginForm loginForm =(LoginForm)form;
		String user= loginForm.getUserName();
		String pass= loginForm.getPassword();
		DUsuario dao= new DUsuario();
		Boolean logueado= dao.login(user, pass);
		SUCCESS=(logueado)?"success":"failure";
		return mapping.findForward(SUCCESS);
		
	}

}




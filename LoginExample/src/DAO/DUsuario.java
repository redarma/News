package DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Model.HibernateUtil;
import Model.Usuario;
public class DUsuario {
	private SessionFactory Session;
	/**
	 * @param args
	 */
	/*
	public static void main(String[] args) {
		TestMain obj = new TestMain();
		obj.saveRecord();//inserta usuario
		obj.getList();//recupera lista de usuarios
	}*/
	public DUsuario ()
	{
		Session = HibernateUtil.getInstance();
	}
	public void saveRecord(Usuario u)
	{
		Session session = Session.getCurrentSession();
		Transaction transaction = null;
		try
		{
			transaction = session.beginTransaction();
			session.save(u);
			transaction.commit();
			System.out.println("Data Saved");
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally{session.close();}
	}

	public void deleteUser(long UserId)
	{
		Session session = Session.getCurrentSession();
		Transaction transaction = null;
		try
		{
			transaction = session.beginTransaction();
			Usuario u = (Usuario)session.get(Usuario.class,UserId);
			session.delete(u);
			transaction.commit();
			System.out.println("Data Deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	public void updateUser(long UserId, Usuario update)
	{
		Session session = Session.getCurrentSession();
		Transaction transaction = null;
		try
		{
			transaction = session.beginTransaction();
			Usuario u = (Usuario)session.get(Usuario.class,UserId);
			transaction.commit();
			System.out.println("Data Updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}

	public List<Usuario> getList()
	{
		Session session = Session.getCurrentSession();
		Transaction transaction = null;
		try
		{
			transaction = session.beginTransaction();
			List<Usuario> uList = (List<Usuario>)session.createQuery("from usuario").list();
			return uList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally{
			session.close();
		}
	}
	public Usuario Get(String usuario)
	{
		Session session = Session.getCurrentSession();
		Transaction transaction = null;
		Usuario uList= new Usuario();
		try
		{
			transaction = session.beginTransaction();
			uList = (Usuario)session.get(Usuario.class,usuario);
			return uList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally{
			session.close();
		}
	}
	public boolean login(String usuario, String Password)
	{
		boolean res=true;
		Session s = Session.getCurrentSession();
		System.out.println("añadir");
		Transaction trans=s.beginTransaction();
		Query query= s.createQuery("FROM Usuario U WHERE U.usuario = :usuario and U.password = :password");
		query.setParameter("usuario", usuario);
		query.setParameter("password", Password);
		List usuarios = query.list();
		
		if (usuarios.isEmpty())
			res= false;
		trans.commit();
		return res;
	}
}
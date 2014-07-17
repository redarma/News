package in.shivasoft.test;

import in.shivasoft.pojo.Users;
import in.shivasoft.util.HibernateUtil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestMain obj = new TestMain();
		obj.saveRecord();//inserta usuario
		obj.getList();//recupera lista de usuarios
	}

	public void saveRecord()
	{
		Users u = new Users(2, "Juan", "Zaa", 1, "jitendra.zaa", "jitendra.zaa@shivasoft.in", "test", "this is note", true);
		Session session = HibernateUtil.getSessionFactory().openSession();
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
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try
		{
			transaction = session.beginTransaction();
			Users u = (Users)session.get(Users.class,UserId);
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
	public void updateUser(long UserId)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try
		{
			transaction = session.beginTransaction();
			Users u = (Users)session.get(Users.class,UserId);
			u.setFName("ShivaSoft");
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

	public void getList()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try
		{
			transaction = session.beginTransaction();
			List<Users> uList = session.createQuery("from Users").list();
			for(Users u : uList)
			{
				System.out.println("First Name - "+u.getFName());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}
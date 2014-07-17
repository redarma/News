package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class HibernateUtil {

	private static SessionFactory sessionFactory;



	private static SessionFactory initSessionFactory()
	{
		Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		return sessionFactory;

	}
	public static SessionFactory getInstance() 
	{
		if (sessionFactory != null)
			return sessionFactory;
		else return initSessionFactory();
	}

	public Session openSession() 
	{
		return sessionFactory.openSession();
	}

	public Session getCurrentSession() 
	{
		return sessionFactory.getCurrentSession();
	}

	public static void close()
	{
		if (sessionFactory != null)
		{
			sessionFactory.close();
			sessionFactory = null;
		}
	}
}
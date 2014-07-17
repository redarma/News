// default package
// Generated 16/07/2014 08:36:51 AM by Hibernate Tools 3.4.0.CR1
package Model;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Perfil.
 * @see .Perfil
 * @author Hibernate Tools
 */
public class PerfilHome {

	private static final Log log = LogFactory.getLog(PerfilHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Perfil transientInstance) {
		log.debug("persisting Perfil instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Perfil instance) {
		log.debug("attaching dirty Perfil instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Perfil instance) {
		log.debug("attaching clean Perfil instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Perfil persistentInstance) {
		log.debug("deleting Perfil instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Perfil merge(Perfil detachedInstance) {
		log.debug("merging Perfil instance");
		try {
			Perfil result = (Perfil) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Perfil findById(java.lang.String id) {
		log.debug("getting Perfil instance with id: " + id);
		try {
			Perfil instance = (Perfil) sessionFactory.getCurrentSession().get(
					"Perfil", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Perfil> findByExample(Perfil instance) {
		log.debug("finding Perfil instance by example");
		try {
			List<Perfil> results = (List<Perfil>) sessionFactory
					.getCurrentSession().createCriteria("Perfil")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}

package DaoImpl;

import javax.transaction.Transactional;

import org.h2.engine.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.Dao.UserDao;

public class UserDaoImpl implements UserDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;
		
	}
    @Transactional
	public void insertUser(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(user);
		session.getTransaction().commit();
	}
	@Override
	public void insertUser(com.model.User user) {
		// TODO Auto-generated method stub
		
	}
}

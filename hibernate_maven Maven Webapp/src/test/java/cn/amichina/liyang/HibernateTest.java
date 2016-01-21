package cn.amichina.liyang;

import java.util.Date;

import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.amichina.domain.Report;
import cn.amichina.utils.HibernateUtils;

public class HibernateTest {

	private SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	private Session session = sessionFactory.openSession();
	private Transaction tran = session.beginTransaction();
	
	@Test
	public void createTable(){
		HibernateUtils.getSessionFactory();
	}

	@Test
	public void save(){
		
		Report report = new Report();
		report.setTime(new Date());
		report.setVlanId("5125");
		report.setAppId("default app");
		report.setUpload(513.86);
		report.setDownload(315.67);
		report.setNum(52);
//		session.save(report);
//		session.persist(report);
		tran.commit();
		session.close();
	}
	
	@Test
	public void load(){
		
//		Report r1 = (Report)session.load(Report.class, 3L);
		Report r1 = new Report();
		session.load(r1, 4L);
		String sql = "";
		Query query = session.createQuery(sql);
		query.setLockMode("", LockMode.FORCE);
		System.out.println(r1);
	}
}

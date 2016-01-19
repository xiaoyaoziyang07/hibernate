package cn.amichina.liyang;

import org.junit.Test;

public class HibernateTest {
	
	@Test
	public void createTable(){
		HibernateUtils.getSessionFactory();
	}

}

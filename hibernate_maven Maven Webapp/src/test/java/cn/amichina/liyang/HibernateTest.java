package cn.amichina.liyang;

import org.junit.Test;

import cn.amichina.utils.HibernateUtils;

public class HibernateTest {
	
	@Test
	public void createTable(){
		HibernateUtils.getSessionFactory();
	}

}

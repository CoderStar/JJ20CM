package com.WB.test.cn;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx = null;

	static {
		ctx = new FileSystemXmlApplicationContext("G:/JAVA/WebDemo/WebContent/WEB-INF/cfg/cfg-spring.xml");
	}

	@org.junit.Test
	/**
	 *  ˝æ›ø‚¡¥Ω”≤‚ ‘
	 * @throws SQLException
	 */
	public void test() throws SQLException {
		DataSource dt = (DataSource) ctx.getBean("dataSource");
		System.out.println(dt.getConnection());
	}

	@org.junit.Test
	/**
	 * mybatis¡¥Ω”≤‚ ‘
	 */
	public void test1(){
		SqlSessionFactory sq = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
		
		System.out.println(sq.openSession());
	}
	
	
}

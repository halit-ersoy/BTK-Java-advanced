package com.hibernatedemo;

import java.util.ArrayList;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.mysql.cj.Session;
import antlr.collections.List;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
	
		try {
			
			session.beginTransaction();
			
			//HQL -> Hibernate Query Language
			//Select * from city
			//List<City> cities = session.createQuery("form city c where c.countryCode='TUR' AND c.district='Ankara'
			//List<City> cities = session.createQuery("form city c where c.countryCode='TUR' OR c.countryCode='USA'").getResultList();
			//List<City> cities = session.createQuery("form city c where c.name LIKE '%kar%').getResultList();
			//ASC-Ascending
			//DESC-Descending
			//List<City> cities = session.createQuery("form City c ORDER BY c.name DESC").getResultList();
			//List<City> cities = session.createQuery("form City c ORDER BY c.name").getResultList();
			//List<City> cities = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode").getResultList();
			
			//session.getTransaction().commit();
			
			//for(City city:cities){
			//	System.out.println(city.getName());
			//}
			
			//City city = new city();
			//city.setName("Düzce");
			//city.setCountryCode("TUR");
			//city.setDistrict("Karadeniz");
			//city.setPopulation(7000);
			//
			//session.save(city);
			
			
			//City city = session.get(City.class, 4096);
			//city.setPopulation(110000);
			//session.save(city);
			
			City city = session.get(City.class, 4096);
			session.delete(city);
			
			session.getTransaction().commit();
			System.out.println("şehir eklendi.");
			
			
			
			
		}finally {
			factory.close();
		}
		
	}

}

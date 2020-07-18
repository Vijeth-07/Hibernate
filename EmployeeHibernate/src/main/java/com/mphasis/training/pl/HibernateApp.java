package com.mphasis.training.pl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import com.mphasis.training.entities.Department;
import com.mphasis.training.entities.Employee;
import com.mphasis.training.entities.Job;
import com.mphasis.training.entities.Location;


public class HibernateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Location.class).
				addAnnotatedClass(Department.class).addAnnotatedClass(Job.class);
		StandardServiceRegistryBuilder builder= 
				new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory sessionFactory=con.buildSessionFactory(builder.build());
//		Student st=new Student();
//		st.setName("Vijeth");
//		st.getEmail().add("vijeth@gmail.com");
//		st.getEmail().add("vij@mph.com");
//		st.getLp().setLpcode("LP121");
//		st.getLp().setBrand("Dell");
//		st.getLp().setProcessor("Inteli3");
//		st.getLp().setHddsize(1);
//		st.getLp().setRamsize(8);
		Location l=new Location();
		l.setLcode("L01");
		l.setLname("GTP");
		Department d1=new Department();
		d1.setDeptcode(1);
		d1.setDname("Sales");
		d1.setLoc(l);
		Job j1=new Job();
		j1.setJcode("J01");
		j1.setJname("Salesman");
		Employee e=new Employee();
		e.setEname("Rakshith");
		e.setSalary(45000.00);
		e.setBonus(450.00);
		java.sql.Date d=java.sql.Date.valueOf("2015-03-31");
		e.setDoj(d);
	
		e.setDepartment(d1);
		e.setJob(j1);


		//		e.getDepartment().setDeptcode(1);
//		e.getDepartment().setDname("Sales");
//		e.getDepartment().getLoc().setLcode("L01");
//		e.getDepartment().getLoc().setLname("GTP");
//	    e.getJob().setJcode("J01");
//	    e.getJob().setJname("Salesman");
	 
//		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(l);
		session.save(d1);
		session.save(j1);
		session.save(e);
		session.getTransaction().commit();
		session.close();	
	}

}

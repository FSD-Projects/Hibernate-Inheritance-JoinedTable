package com.mycompany.hibernate_inheritance_joined;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_inheritance_joined.model.ContractEmployee;
import com.mycompany.hibernate_inheritance_joined.model.Employee;
import com.mycompany.hibernate_inheritance_joined.model.RegularEmployee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Session session;
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class).addAnnotatedClass(RegularEmployee.class)
					.addAnnotatedClass(ContractEmployee.class).buildSessionFactory();
			session = factory.openSession();

			Employee employee = new Employee("Arthur");
			RegularEmployee regEmployee = new RegularEmployee("Kabir", 15000, 2000);
			ContractEmployee contractEmployee = new ContractEmployee("Meena", 500, "6 months");
			Transaction tx = session.getTransaction();
			tx.begin();
			session.save(employee);
			session.save(regEmployee);
			session.save(contractEmployee);
			tx.commit();
			System.out.println("Done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

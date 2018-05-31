package com.ar.hibernate;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.XmlMappingException;

public class EmployeeTest {

	public static void main(String[] args) throws XmlMappingException, IOException {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Marshaller m=(Marshaller) context.getBean("xstream");
	    Employee e=new Employee();
	    e.setId(300);
        e.setName("ar");
        e.setSalary(69599);
        m.marshal(e, new StreamResult(new FileWriter("emp.xml")));
        
        System.out.println("Xml created successfully");
	}

}

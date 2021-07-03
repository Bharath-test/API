package org.data;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.test.Employee;

public class Sample {
	
	public static void main(String[] args) throws JAXBException {
		readxml();
	}
	
	public static void readxml() throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		
		Unmarshaller un = context.createUnmarshaller();
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\API\\EmployeeDetails.xml");
		
		Object obj = un.unmarshal(f);
		
		Employee e = (Employee) obj;
		
		System.out.println(e.getEmpid());
		
		
		

	}

}

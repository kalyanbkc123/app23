package com.durgasoft;

import org.springframework.context.ApplicationContext;
import com.durgasoft.beans.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        employee.getEmployDetails();
    }
}
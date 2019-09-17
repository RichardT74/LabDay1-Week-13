package com.codeclan.employeetracker.EmployeeTracker;

import com.codeclan.employeetracker.EmployeeTracker.models.Employee;
import com.codeclan.employeetracker.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployee() {
		Employee employee = new Employee("Sara Thompson", 27, 6667,"Sara.T@gmail.com");
		employeeRepository.save(employee);

	}

}

package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class AppTest2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("#### TEST 1: department Insert ####");
		Department newDepartment = new Department(null,"Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id = " + newDepartment.getId());
		
		System.out.println("\n#### TEST 2: department  Update ####");
		Department department = departmentDao.findById(4);
		department.setName("Corrida");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n#### TEST 3: department  findById ####");
		department = departmentDao.findById(3);		
		System.out.println(department);
		
		System.out.println("\n#### TEST 4: department  findAll ####");
		List <Department> list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
	}

}

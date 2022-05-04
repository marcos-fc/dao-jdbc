package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class AppTest2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("#### TEST 1: Insert ####");
		Department newDepartment = new Department(null,"Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id = " + newDepartment.getId());
		
		System.out.println("\n#### TEST 5: seller sellerUpdate ####");
		Department department = departmentDao.findById(4);
		department.setName("Corrida");
		departmentDao.update(department);
		System.out.println("Update completed");
	}

}

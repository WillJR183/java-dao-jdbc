package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1: Department findById =====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n===== TEST 2: Department findAll =====");
		List<Department> list = departmentDao.findAll();
		departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===== TEST 3: Department insert =====");
		Department dep = new Department(null, "New Department");
		departmentDao.insert(dep);
		System.out.println("Inserted completed! New id = " + dep.getId());
		
		System.out.println("\n===== TEST 4: Department update =====");
		department = departmentDao.findById(3);
		department.setName("Classic");
		departmentDao.update(department);
		System.out.println("Update complete!");
		
		sc.close();
	}

}
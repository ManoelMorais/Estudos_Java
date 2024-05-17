package JDBC.PROJETO;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: seller findbyid ===");
        Department department = depDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== Test 2: seller findAll ===");
        List<Department> list = depDao.findAll();
        for (Department s : list) {
            System.out.println(s);
        }

//        System.out.println("\n=== Test 3: seller insert ===");
//        Department newDepartment = new Department(null, "Music");
//        depDao.insert(newDepartment);
//        System.out.println("Inserted! New id = " + newDepartment.getId());
//
//        System.out.println("\n=== Test 4: seller update ===");
//        department = depDao.findById(1);
//        department.setName("BreakFast");
//        depDao.update(department);
//        System.out.println("Updated! completed");

        System.out.println("\n=== Test 5: seller delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        depDao.deleteById(id);
        System.out.println("Delete! completed");
    }
}

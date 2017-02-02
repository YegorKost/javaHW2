package com.yegor.employee_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * This class represents a company that contains employees
 * Created by YegorKost on 01.02.2017.
 */
public class Company {

    private Map<Integer, Employee> employees = new HashMap<>();

    /**
     * This method adds employee to company and generates a random id for employee.
     * @param employee employee that will be added to company
     * @return id for employee
     */
    public int addEmployee(Employee employee) {
        Random random = new Random();
        int id;
        do {
            id = random.nextInt();
            if (id > 0 && employees.get(id) == null){
                employee.setId(id);
                employees.put(id, employee);
                return id;
            }
        } while (true);
    }

    /**
     * This method return employee by id.
     * @param id id for employee
     * @return employee of a company
     */
    public Employee gatEmployee(int id) {
        return employees.get(id);
    }

}

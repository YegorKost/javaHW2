package com.yegor.premium_1;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a company.
 * Created by YegorKost on 01.02.2017.
 */
class Company {
    private static Company company;
    private List<Employee> employees = new ArrayList<>();

    private Company(){}

    /**
     * Method returns company object
     * @return
     */
    public static Company getCompany() {
        return company == null ? company = new Company(): company;
    }

    /**
     * This method adds employee to company
     * @param employee employee that will be added to company
     * @return true if employee is added, otherwise false
     */
    public boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }

    /**
     * This method removes employee from company
     * @param employee employee that will be removed from company
     * @return true if employee is removed, otherwise false
     */
    public boolean removeEmplotee(Employee employee) {
        return employees.remove(employee);
    }

    /**
     * Method returns employee by index from list
     * @param index index
     * @return returns employee from list
     */
    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    /**
     * This method returns the number of employee in company
     * @return the number of employee
     */
    public int getNumberOfEmployees() {
        return employees.size();
    }
}

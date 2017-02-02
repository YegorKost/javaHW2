package com.yegor.premium_1;

import java.util.Random;

/**
 * This class select employee for premium.
 * Created by YegorKost on 01.02.2017.
 */

public class Premium {
    /**
     * This method returns a random employee
     * @param company a company where we looking for employee for premium
     * @return returns an employee from company
     */
    public Employee getEmployeeForPremium(Company company) {
        Random random = new Random();
        return company.getEmployee(random.nextInt(company.getNumberOfEmployees()));
    }

    public static void main(String[] args) {
        Premium premium = new Premium();
        Company company = Company.getCompany();
        company.addEmployee(new Employee("Serge", "Markov"));
        company.addEmployee(new Employee("Sofia", "Ali"));
        company.addEmployee(new Employee("Elene", "Blues"));
        company.addEmployee(new Employee("Victoria", "Su"));
        company.addEmployee(new Employee("Bob", "Dilan"));
        Employee employeeForPremium = premium.getEmployeeForPremium(company);
        System.out.println("The premium will be paid to " + employeeForPremium);
    }



}

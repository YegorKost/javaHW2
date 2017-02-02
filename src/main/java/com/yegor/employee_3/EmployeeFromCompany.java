package com.yegor.employee_3;

import java.util.ArrayList;
import java.util.List;

/**
 * This class adds employees to company and then returns to console.
 * Created by YegorKost on 01.02.2017.
 */
public class EmployeeFromCompany {

    public static void main(String[] args) {
        Company company = new Company();
        List<Integer> ids = new ArrayList<>(); // list of ids
        ids.add(company.addEmployee(new Employee("Arden", "Maced")));
        ids.add(company.addEmployee(new Employee("Bob", "Lop")));
        ids.add(company.addEmployee(new Employee("Bruce", "Maced")));
        ids.add(company.addEmployee(new Employee("Sara", "Gig")));
        ids.add(company.addEmployee(new Employee("Norman", "Warty")));
        ids.add(company.addEmployee(new Employee("Jek", "Nil")));
        ids.add(company.addEmployee(new Employee("Faro", "Luk")));
        ids.add(company.addEmployee(new Employee("Pol", "Klee")));
        ids.add(company.addEmployee(new Employee("Andre", "Maced")));
        ids.add(company.addEmployee(new Employee("Charley", "Maced")));

        for (Integer id: ids) {
            System.out.println(company.gatEmployee(id));
        }
    }

}

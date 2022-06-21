package com.revature.dao;


import org.hibernate.Transaction;
import org.hibernate.Session;

import com.revature.models.Employee;
import com.revature.util.Hibernate;

public class EmployeeDao {

  /**
   * 
   * @param employee - the employee object to be added to the DB
   * @return the id of the employee that was added to the DB
   */
  public int insert(Employee employee) {
    Session session = Hibernate.getSession();
    session.beginTransaction();
    return (int) session.save(employee);
  }

  public List<Employee> selectAll() {
    return null;
  }

  public Employee selectById(int id) {
    return null;
  }

  public void update(Employee employee) {

  }

  public void delete(Employee employee) {

  }

  public void deleteById(int id) {

  }


}

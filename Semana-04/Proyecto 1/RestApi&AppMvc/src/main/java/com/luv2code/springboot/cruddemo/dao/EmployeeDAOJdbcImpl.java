package com.luv2code.springboot.cruddemo.dao;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJdbcImpl implements EmployeeDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public List<Employee> findAll() {
		System.out.println("Implementación DAO con JDBC: " + dataSource);

		List<Employee> listaEmpleados = new ArrayList<>();

		String sql = "SELECT * FROM employee";

		try (Connection myConn = dataSource.getConnection();
				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery(sql);) {

			// process result set
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");

				// create new student object
				Employee tempEmployee = new Employee(id, firstName, lastName, email);

				// add it to the list of students
				listaEmpleados.add(tempEmployee);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaEmpleados;
	}

	@Override
	public Employee findById(int theId) {
		Employee theEmployee = null;
		String sqlString = "SELECT * FROM employee WHERE id=?";

		try (Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = createPreparedStatement(myConn, theId, sqlString);
				ResultSet myRs = myStmt.executeQuery();) {

			// retrieve data from result set row
			if (myRs.next()) {
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");

				// use the studentId during construction
				theEmployee = new Employee(theId, firstName, lastName, email);
			} else {
				throw new SQLException("Could not find employee id: " + theId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return theEmployee;
	}

	private PreparedStatement createPreparedStatement(Connection con, int empleadoId, String sqlString)
			throws SQLException {
		String sql = sqlString;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, empleadoId);
		return ps;
	}

	private PreparedStatement createPreparedStatement(Connection con, String sqlString) throws SQLException {
		String sql = sqlString;
		PreparedStatement ps = con.prepareStatement(sql);
		return ps;
	}

	@Override
	public void save(Employee theEmployee) {
		String sqlString = null;
		try (Connection myConn = dataSource.getConnection();) {
			if (theEmployee.getId() == 0) {
				sqlString = "INSERT INTO employee (first_name, last_name, email) VALUES (?,?,?)";
				try (PreparedStatement myStmt = createPreparedStatement(myConn, sqlString);) {
					myStmt.setString(1, theEmployee.getFirstName());
					myStmt.setString(2, theEmployee.getLastName());
					myStmt.setString(3, theEmployee.getEmail());
					System.out.println("Insertando " + theEmployee.getFirstName() + ", " + theEmployee.getLastName());
					myStmt.execute();
				}
			} else {
				sqlString = "UPDATE employee SET first_name=?, last_name=?, email=? WHERE id=?";
				try (PreparedStatement myStmt = createPreparedStatement(myConn, theEmployee.getId(), sqlString);) {
					myStmt.setString(1, theEmployee.getFirstName());
					myStmt.setString(2, theEmployee.getLastName());
					myStmt.setString(3, theEmployee.getEmail());
					myStmt.setInt(4, theEmployee.getId());
					System.out.println("Modificando: " + theEmployee.getFirstName() + ", " + theEmployee.getLastName());
					myStmt.execute();
				}
			}
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void deleteById(int theId) {
		String sqlString = "DELETE FROM employee WHERE id=?";
		try (Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = createPreparedStatement(myConn, theId, sqlString)) {
			System.out.println("Eliminando al empleado con el id "+ theId);
			myStmt.execute();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

}

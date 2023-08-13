package dev.osmanfindik.payroll.employee;

class EmployeeNotFoundException extends RuntimeException {

	EmployeeNotFoundException (Long id) {
		super ("Could not find employee " + id);
	}
}
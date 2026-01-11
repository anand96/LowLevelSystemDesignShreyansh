package main.java.com.conceptcoding.structuralpatterns.proxy;

// RealSubject - the actual employee object that does the real work
public class EmployeeDaoImpl implements EmployeeDao {

    public void getEmployeeInfo(int empID) {
        System.out.println("Fetching employee info for ID :" + empID);
    }

    public void createEmployee(EmployeeDo obj) {
        System.out.println("Creating Employee :" + obj);
    }
}

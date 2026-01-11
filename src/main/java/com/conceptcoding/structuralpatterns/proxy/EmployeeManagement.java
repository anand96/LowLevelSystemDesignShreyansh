package main.java.com.conceptcoding.structuralpatterns.proxy;

public class EmployeeManagement {
    public static void main(String args[]){
        System.out.println("===Proxy Design Patter====");
        EmployeeDao userProxyObj = new EmployeeDaoProxy("USER");
        userProxyObj.getEmployeeInfo(1); // Access Denied
        userProxyObj.createEmployee(new EmployeeDo()); // Access Denied
    }
}

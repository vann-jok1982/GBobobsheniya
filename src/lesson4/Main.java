package lesson4;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory=new EmployeeDirectory();
        employeeDirectory.addEmployee(1,111111,"Сергей",10);
        employeeDirectory.addEmployee(2,222222,"Иван",20);
        employeeDirectory.addEmployee(3,333333,"Влад",15);
        employeeDirectory.addEmployee(4,444444,"Николай",6);
        employeeDirectory.addEmployee(5,232323,"Иван",2);
        employeeDirectory.addEmployee(6,555555,"Олег",20);
        employeeDirectory.printEmployees();
        System.out.println(employeeDirectory.searchLengthOfService(20));
        System.out.println(employeeDirectory.searchNumber("Иван"));
        System.out.println(employeeDirectory.searchServiceNumber(2));
    }
}

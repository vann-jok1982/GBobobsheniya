package lesson4;
//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//Стаж
//Добавить метод, который ищет сотрудника по стажу (может быть список)
//Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавления нового сотрудника в справочник


import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        employees=new ArrayList<>();
    }
    public void addEmployee(int serviceNumber, int phoneNumber, String name, int lengthOfService){
        employees.add(new Employee(serviceNumber,phoneNumber,name,lengthOfService));
    }
    public void printEmployees(){
        for (Employee employee:employees) {
            System.out.println(employee);
        }
    }
    public List<String> searchLengthOfService(int age){ // метод, который ищет сотрудника по стажу (может быть список)
        List<String> listAge=new ArrayList<>();
        for (Employee employee:employees) {
            if (employee.getLengthOfService()==age)listAge.add(employee.getName());
        }
        return listAge;// можно было и id сотрудника вместо имени, а можно и целиком класс, в задании не уточнено как
    }
    public List<Integer> searchNumber(String name){ //метод, который возвращает номер телефона сотрудника по имени (может быть список)
        List<Integer> listPhone=new ArrayList<>();
        for (Employee employee:employees) {
            if (employee.getName().equals(name))listPhone.add(employee.getPhoneNumber());
        }
        return listPhone;
    }
    public String searchServiceNumber(int number){ //метод, который ищет сотрудника по табельному номеру
        for (Employee employee:employees) {
            if (employee.getServiceNumber()==number)return employee.getName();
        }
        return null;
    }
}

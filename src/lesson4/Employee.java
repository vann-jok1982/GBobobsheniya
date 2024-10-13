package lesson4;
//Табельный номер
//Номер телефона
//Имя
//Стаж

import java.util.Objects;

public class Employee {
    private int serviceNumber;
    private int phoneNumber;
    private String name;
    private int lengthOfService;

    public Employee(int serviceNumber, int phoneNumber, String name, int lengthOfService) {
        this.serviceNumber = serviceNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.lengthOfService = lengthOfService;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getLengthOfService() {
        return lengthOfService;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "serviceNumber=" + serviceNumber +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", lengthOfService=" + lengthOfService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getServiceNumber() == employee.getServiceNumber() && getPhoneNumber() == employee.getPhoneNumber() && getLengthOfService() == employee.getLengthOfService() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServiceNumber(), getPhoneNumber(), getName(), getLengthOfService());
    }
}

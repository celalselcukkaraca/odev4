package com.rd;
import java.util.ArrayList;
import java.util.List;

// Person (Personel) sınıfı: Her personelin ismi ve unvanı olacak.
class Person {
    private String name;
    private String title;

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }



    @Override
    public String toString() {
        return "Personel: " + name + ", Unvanı: " + title;
    }
}

// Department (Departman) sınıfı: Departmanın adı ve personel listesi olacak.
class Department {
    private String departmentName;
    private List<Person> employees;

    // Yapıcı metot, departman ismini alır ve personel listesi için bir ArrayList oluşturur.
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Personel eklemek için bir metot
    public void addEmployee(Person person) {
        employees.add(person);
    }

    // Tüm personelleri dönen metot
    public List<Person> getEmployees() {
        return employees;
    }

    // Departman bilgilerini ekrana yazdıran metot
    public void printEmployees() {
        System.out.println("Departman: " + departmentName);
        for (Person person : employees) {
            System.out.println(person);
        }
    }
}

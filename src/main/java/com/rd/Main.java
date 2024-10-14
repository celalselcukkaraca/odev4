package com.rd;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Bir departman oluşturuyoruz.
        Department itDepartment = new Department("Bilgi Teknolojileri Departmanı");

        // Departmana personel ekliyoruz.
        Person employee1 = new Person("Kemal Karaca", "Kıdemli Yazılım Geliştirici");
        Person employee2 = new Person("Celal Selçuk Karaca", " Yazılım Test Mühendisi");
        Person employee3 = new Person("Aysel Karaca", "Sistem Yöneticisi");

        itDepartment.addEmployee(employee1);
        itDepartment.addEmployee(employee2);
        itDepartment.addEmployee(employee3);

        // Eklenen personelleri listele
        itDepartment.printEmployees();
        }
    }

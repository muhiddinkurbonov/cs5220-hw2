package org.example;

public class Employee implements Cloneable {
    private String id;
    private String name;
    private String designation;
    private double salary;
    Address address;

    public Employee(String id, String name, String designation, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.address = (Address) address.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name=" + name + ", designation=" + designation + ", salary=$" + salary + ", address=" + address + "}";
    }
}

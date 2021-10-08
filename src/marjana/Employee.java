package marjana;

public class Employee {
    int id;
    String name;
    Address address;
    Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Name of the student is: "+name);
        System.out.println("ID of the student is: "+id);
        System.out.println("House number of the student is: "+address.houseNo);
        System.out.println("City: "+address.city+", Country: "+address.country);
    }

}

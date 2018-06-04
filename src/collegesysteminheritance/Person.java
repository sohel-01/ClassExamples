/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesysteminheritance;

/**
 *
 * @author macstudent
 */
public class Person {
    
    private int id;
    private String firstName;
    private String lastName;
    private String gender;//MALE or FEMALE
    private String address;
    private String city;
    
    public Person(int id, String firstName, String lastName, String gender, String address, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.city = city;
    }
    public Person(Person p){
        
        this.id = p.getId();
        this.firstName = p.getFirstName();
        this.lastName = p.getLastName();
        this.gender = p.getGender();
        this.address = p.getAddress();
        this.city = p.getCity();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public void display(){
        System.out.println("ID : " +this.id +"\n First Name :"+this.firstName +"\n Last Name : " +this.lastName+"\n Gender : "+this.gender+"\n Adress : "+this.address+"\n City "+this.address);
    }
    
    
}

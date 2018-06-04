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
public class CollegeSystemInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.display();
        
        
        
        Person p1 = new Person();
        p1.display();
        
        //runtime binding
        p1 = s1;
        p1.display();
    }
    
}

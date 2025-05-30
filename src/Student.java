 /**
  * Represent a student in classroom
  @author tunglvm
  */
public class Student {

    /*
     * instance variables
     */

    //name of student
    String name;

    //ID of student
    String ID;

    //constructor
    /**
     * Creat a student with name and ID
     * @param name
     * @param ID
     */
    public Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    //methods
    /**
     * Return name of student (help when to print a student)
     */
    public String toString(){
        return this.name;
    }
}

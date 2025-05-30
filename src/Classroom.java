import java.util.ArrayList;
import java.util.zip.Adler32;

/**
 * Represent a classroom with and stdents
 * Each classroom has a list of student
 * and array that represent seats in the classroom
 * @author tunglvm
 */

public class Classroom {
    
    /*
     * Instance vars
     */
    //Name of buiding
    String buildingName;

    //Name of classroom
    String roomName;

    //list of student in the classroom
    ArrayList<Student> students;

    //Seat in the classroom
    Seat[][] seats;  //2-dimentional array

    //Constructor
    /**
     * Creat a classroom with given:
     * @param buildingName name of building
     * @param roomName name of room
     * @param rows row for seats
     * @param clumns column for seats
     */
    public Classroom(String buildingName, String roomName, int rows, int columns ) {

        //set building name
        this.buildingName = buildingName;

        //set room name
        this.roomName = roomName;

        //initialize seats arry
        this.seats = new Seat[rows][columns];
        //populate seats array with instances of seat class
        for (int i = 0; i < rows; i++){          //iterate over rows
            for (int j = 0; j < columns; j++){  //iterate over columns
                //give each location its own new instance of seat
                seats[i][j] = new Seat(i, j); //seats here is equivalent to this.seats
            }
        }
        //initialize list of student
        this.students = new ArrayList<Student>();


    }

    /**
     * Add the given student to list of student
     * @param student
     */
    public void addAStudent(Student student){
        this.students.add(student);
    }

    /**
     * Assign given student to available seat
     * @param student
     */
    public void assignStudentToSeat(Student student){
        int rows = this.seats.length;         //this seat refers to intance var seat that declear in Classrom class
        int columns = this.seats[0].length;   //length of the first row = number of column

        for (int i = 0; i < rows; i++){          //iterate over rows
            for (int j = 0; j < columns; j++){  //iterate over columns
                //get seat in the location nd check if it's available
                if(this.seats[i][j].studentInSeat == null){ //check if any student in seat

                    //assign given student
                    this.seats[i][j].putStudentInSeat(student);

                    return; //exit loops and method
                }
            }
        }

    }
    /**
     * print all student 
     */
    public void printAllStudent(){
        System.out.println("Students in class");
        
        for (Student student : this.students){  
            System.out.println(student);  //this will call the toString method in the Student class
        }
    }

    public String toString(){
        String s = "\n";

        int rows = this.seats.length;         //this seat refers to intance var seat that declear in Classrom class
        int columns = this.seats[0].length;   //length of the first row = number of column
        for (int i = 0; i < rows; i++){          //iterate over rows
            for (int j = 0; j < columns; j++){  //iterate over columns
                s += this.seats[i][j] + "\t"; // casll the toString method in the seat class
                }
                s += "\n"; //add newline at the end of each row
            }       
    return s;
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //create classroom
        Classroom ICTVJ = new Classroom("A2", "506", 10, 5);

        //creat student
        Student tunglvm = new Student("tunglvm", "23010874");
        Student qunhchi = new Student("quynhchi", "23010618");

        //add students to classroom
        ICTVJ.addAStudent(tunglvm);
        ICTVJ.addAStudent(qunhchi);

        //assign students to seats
        ICTVJ.assignStudentToSeat(tunglvm);
        ICTVJ.assignStudentToSeat(qunhchi);

        //print list of all student
        ICTVJ.printAllStudent();

        //print classroom
        System.out.println(ICTVJ); //this will call the toString method in the classroom class
    }
}

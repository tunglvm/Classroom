import java.util.ArrayList;

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
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

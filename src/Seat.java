/**
 * Represent a seat in a classroom
 * Each seat have a row and a column values
 * Might have a student assign to that seat (empty seat)
 * @author tunglvm
 */
public class Seat {
    /*
     * instances variables
     */
    //seat row
    int row;

    //seat column
    int column;

    //student assign to this seat
    //otherwise NULL
    Student studentInSeat;

    //constructor
    /**
     * Creat seat fora class at the given row and column
     * @param row
     * @param column
     */
    public Seat(int row, int column){
        this.row = row;
        this.column = column;
    }

    //method
    /**
     * assign given student to the seat
     * @param student student to assign
     */
    public void putStudentInSeat(Student student) {
        this.studentInSeat = student;
    }

    /**
     * Return the row, column and student for the seat
     */
    public String toString() {
        return this.row + "," + this.column + ": " + this.studentInSeat;
    }//this will call the toString method in the student class


}

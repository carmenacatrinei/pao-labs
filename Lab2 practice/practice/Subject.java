package practice;

public class Subject {
    private Room room;
    private int noOfStudents;
    private Person teacher;

    Subject(){}

    public Subject(Room room, int noOfStudents, Person teacher) {
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    public Subject(int roomNumber, String roomType, int roomFloor, Room room, int noOfStudents, Person teacher) {
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "practice.Subject{" +
                "room=" + room +
                ", noOfStudents=" + noOfStudents +
                ", teacher=" + teacher +
                '}';
    }
}

package problem3.Student;

public class Students {
    private String Name;
    private int rollNo;

    public Students(String name, int rollNo) {
        Name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return  getName() + " " + getRollNo();
    }
}


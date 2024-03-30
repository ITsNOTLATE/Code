package Interface;

public class Student {
    int rollNo;
    int class_no;

    public Student(int rollNo, int class_no) {
        this.rollNo = rollNo;
        this.class_no = class_no;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getClass_no() {
        return class_no;
    }

    public void setClass_no(int class_no) {
        this.class_no = class_no;
    }
}

package LinkedList_Questions;

import java.util.concurrent.locks.Lock;

public class Student implements Comparable<Student>{
    int id;
    String name;
    int rollNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    @Override
    public int compareTo(Student other) {
        if(this.id== other.id){
            return 0;
        } else if(this.id> other.id){
            return 1;
        }
        return -1;
    }
}

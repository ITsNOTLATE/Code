package Comparator;

public class Students {
    int id;
    int rollno;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(int id, int rollno, String name) {
        this.id = id;
        this.rollno = rollno;
        this.name = name;
    }
}

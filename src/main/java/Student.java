public class Student {
    private String Name;
    private int Number;

    public Student(String Name, int Number){
        this.Name= Name;
        this.Number=Number;


    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
    public void printStudentDetails(){

        System.out.println("Name:"+Name+"Number:"+Number);
    }
    }

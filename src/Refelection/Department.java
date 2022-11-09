package Refelection;

public class Department {
    private int id;
    public String name;
    private String department ;
    private double selary;



    public Department() {
    }

    public Department(int id, String name, String department, double selary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.selary = selary;
    }


    private void  changeDepartment(String newDepartment){
        department=newDepartment;
        System.out.println("Department was changed:"+department);

    }
    private void  changeDepartment(int count){
        department=department;
        System.out.println("Department was changed:"+department);

    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", selary=" + selary +
                '}';
    }
}

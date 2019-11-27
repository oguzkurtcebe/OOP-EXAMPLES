package Kalitim;
public class Calisan {
   private String name;
   private String department;
   private int salary;

    public Calisan() {
    }

    public Calisan(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void bilgiler(){
        System.out.println("İsim:"+this.name);
        System.out.println("Departman:"+this.department);
        System.out.println("Maaş:"+this.salary);
    }
}

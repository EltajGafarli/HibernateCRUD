import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="company")
    private String company;


    public Employee(){}

    public Employee(String first_name, String last_name, String company){
        this.first_name = first_name;
        this.last_name = last_name;
        this.company = company;
    }

    public String getFirst_name(){
        return this.first_name;
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public String getLast_name(){
        return this.last_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public String getCompany(){
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){this.id = id;}

    @Override
    public String toString(){
        return this.getClass().getName() + "[ id = " + this.id + ", name = " + this.first_name + ", last-name = " + this.last_name + ", company = " + this.company + "]";
    }
}

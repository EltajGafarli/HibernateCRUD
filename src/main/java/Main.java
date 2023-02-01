import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    private static final SessionFactory sessionFactory = new Configuration().addProperties(HProperties.getProperty())
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();

    public static void main(String[] args) {

        EmployeeCRUD crud = new EmployeeCRUD(sessionFactory);

        Employee employee = new Employee("John", "Wick", "Killer");

        // save or create
        crud.save(employee);

        // read
        Employee read = crud.getEmployeeID(1);

        //update
        // first read
        Employee old = crud.getEmployeeID(1);
        old.setCompany("Something");
        crud.update(old);

        // delete
        // first read
        Employee old1 = crud.getEmployeeID(1);
        crud.delete(old1);

        // list

        List<Employee> list = crud.employeeList();

        for(Employee emp : list){
            System.out.println(emp);
        }

    }
}

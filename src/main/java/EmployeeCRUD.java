import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EmployeeCRUD implements IEmployeeCRUD {

    private SessionFactory sessionFactory;

    private Session session;



    public EmployeeCRUD(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
        this.session = this.sessionFactory.openSession();
    }

    @Override
    public void save(Employee employee) {
        this.session.beginTransaction();
        this.session.save(employee);
        this.session.getTransaction().commit();
    }

    @Override
    public void delete(Employee employee) {

        this.session.beginTransaction();
        this.session.delete(employee);
        this.session.getTransaction().commit();
    }

    @Override
    public void update(Employee employee) {
        this.session.beginTransaction();
        this.session.update(employee);
        this.session.getTransaction().commit();
    }

    @Override
    public Employee getEmployeeID(int id) {
        this.session.beginTransaction();
        Employee emp = this.session.get(Employee.class, id);
        this.session.getTransaction().commit();
        return emp;
    }

    @Override
    public List<Employee> employeeList(){
        this.session.beginTransaction();
        List<Employee> list = this.session.createQuery("from Employee").list();
        return list;
    }

}

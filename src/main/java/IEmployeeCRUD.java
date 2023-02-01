import java.util.List;

public interface IEmployeeCRUD {
    void save(Employee employee);

    void delete(Employee employee);

    void update(Employee employee);

    Employee getEmployeeID(int id);

    List<Employee> employeeList();
}

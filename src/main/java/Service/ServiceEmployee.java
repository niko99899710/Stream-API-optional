package Service;

import com.example.streamapioptional.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ServiceEmployee {

     Object findDepartmentMaxSalaryEmployee (Integer department);
     Employee findDepartmentMinSalaryEmployee (Integer department, Integer salary);

     Optional<Employee> findDepartmentMinSalaryEmployee(Integer department);

     Optional<List<Employee>> findDepartmentsAllEmployee (Integer department, Integer salary);
     Map <Integer, List <Employee>> getAllDepartments ();

}

package service;

import com.example.streamapioptional.Employee;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ServiceEmployeeImpl implements ServiceEmployee {
    public final DepartmentService departmentService;

    public ServiceEmployeeImpl (DepartmentService departmentService) {

        this.departmentService = departmentService;
    }
    @Override
    public Optional<Employee> findDepartmentMaxSalaryEmployee(Integer department) {
        return Optional.ofNullable(departmentService.getAll()
                .stream()
                .filter(employee -> Objects.equals(employee.getDepartment(), department))
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(() -> new IllegalArgumentException("don't have employee")));
    }

    @Override
    public Employee findDepartmentMinSalaryEmployee(Integer department, Integer salary) {
        return null;
    }

    @Override
    public  Optional<Employee> findDepartmentMinSalaryEmployee(Integer department) {
        return Optional.ofNullable(departmentService.getAll()
                .stream()
                .filter(employee -> Objects.equals(employee.getDepartment(), department))
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(() -> new IllegalArgumentException("don't have employee")));

    }

    @Override
    public Optional<List<Employee>> findDepartmentsAllEmployee(Integer department, Integer salary) {
        return Optional.of(departmentService.getAll()
                .stream()
                .filter(employee -> Objects.equals(employee.getDepartment(), department))
                .collect(Collectors.toList()));
    }

    @Override
    public Map<Integer, List<Employee>> getAllDepartments() {
        return departmentService.getAll()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

}

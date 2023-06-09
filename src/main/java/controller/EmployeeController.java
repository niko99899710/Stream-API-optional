package controller;

import com.example.streamapioptional.Employee;
import service.ServiceEmployee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/departman")
public class EmployeeController {
private final ServiceEmployee serviceEmployee;

    public EmployeeController(ServiceEmployee serviceEmployee) {
        this.serviceEmployee = serviceEmployee;
    }
@GetMapping("/max-salary")
    public Optional<Employee> findDepartmentMaxSalaryEmployee (@RequestParam ("department") Integer department){
    return (Optional<Employee>) serviceEmployee.findDepartmentMaxSalaryEmployee(department);
}

@GetMapping( "/min-salary")
    public Optional<Employee> findDepartmentMinSalaryEmployee (@RequestParam ("department") Integer department){
    return serviceEmployee.findDepartmentMinSalaryEmployee(department);
    }

    @GetMapping(value = "/all", params = "/departments")
    public Optional<List<Employee>> findDepartmentsAllEmployee (@RequestParam ("department") Integer department,
                                                                @RequestParam ("salary") Integer salary){
        return serviceEmployee.findDepartmentsAllEmployee(department, salary);
    }

    @GetMapping("/all")
    public Map<Integer, List <Employee>> getAllDepartments() {
        return serviceEmployee.getAllDepartments();
    }
}

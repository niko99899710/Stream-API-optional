package Service;

import com.example.streamapioptional.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DepartmentServiceImpl {
    private Map<Integer, Employee> storage = new HashMap<>();
    public Collection<Employee> getAll() {
        return storage.values();
    }
}

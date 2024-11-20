package empapp;

import com.training360.services.empapp.EmployeeWebServiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpappWsClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmpappWsClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var service = new EmployeeWebServiceService();
        var port = service.getEmployeeWebServicePort();
        var response = port.findAllEmployees();
        response.forEach(e -> System.out.println(e.getName()));
    }
}

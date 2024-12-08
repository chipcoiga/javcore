package com.jav.lhloc.lab30;

import com.jav.lhloc.lab30.controller.SampleController;
import com.jav.lhloc.lab30.repository.ProductRepository;
import com.jav.lhloc.lab30.repository.SampleRepository;
import com.jav.lhloc.lab30.service.ProductService;
import com.jav.lhloc.lab30.service.SampleService;

public class MainProcess {

    /**
     * Vận dụng nguyên lý lập trình SOLID
     * DI = Dependency Inversion
     * DI = Dependency Injection
     * @param args
     */
    public static void main(String[] args) {
        String connectionUrl = "jdbc:mysql://localhost:3306/sample";

        SampleRepository repository = new SampleRepository(connectionUrl, "root", "root");
        ProductRepository productRepository = new ProductRepository(connectionUrl);
        // UserRepository
        // HocSinhRepository
        // NhanVienRepository

        SampleService service = new SampleService(repository);
        ProductService productService = new ProductService(productRepository);
        // UserService
        // HocSinhService
        // ...

        SampleController controller = new SampleController(service);
        controller.doSomething();
    }
}

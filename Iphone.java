Iphone com.example.demo;

import com.example.demo.Iphone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IphoneController {
    @GetMapping("/product")
    public List<Product> getProducts() {
        // Creating dummy products for testing
        List<Product> products = new ArrayList<>();
        products.add(new Car(1L, "S24", 799.99));
        products.add(new Car(2L, "XR", 699.99));

        return products;
    }
}

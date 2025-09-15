package starter.Controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PublicPath {
    @GetMapping("/ping")
    @Operation(summary = "Check Api Status")
    public void getProfile() {
        // ...
    }
}

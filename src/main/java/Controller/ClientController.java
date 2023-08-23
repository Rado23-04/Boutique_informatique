package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/ping")
    public String pingpong(){
        return "dflkdsjflqs";
    }
}

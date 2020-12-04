package de.daroge.jenkinsci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/info")
    public String getInfo() {
        return "index";
    }
}

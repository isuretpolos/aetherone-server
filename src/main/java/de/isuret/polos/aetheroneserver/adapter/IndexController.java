package de.isuret.polos.aetheroneserver.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String getIndexContent() {
        return "<h1>hello</h1>";
    }
}

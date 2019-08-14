package de.isuret.polos.aetheroneserver.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hotbits")
public class HotbitsAdapter {

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>();
    }
}

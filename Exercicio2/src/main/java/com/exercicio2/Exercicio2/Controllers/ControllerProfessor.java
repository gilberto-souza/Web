package com.exercicio2.Exercicio2.Controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffees")
public class ControllerProfessor {
 
    @GetMapping
    public String getControllerProfessor() {
        return "oi";
    }
}
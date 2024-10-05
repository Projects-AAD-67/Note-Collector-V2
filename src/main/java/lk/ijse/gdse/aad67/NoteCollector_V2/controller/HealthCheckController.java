package lk.ijse.gdse.aad67.NoteCollector_V2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/health")
public class HealthCheckController {
    @GetMapping
    public String healthTest(){
        return "Note controller is working";
    }
}

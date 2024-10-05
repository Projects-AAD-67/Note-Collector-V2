package lk.ijse.gdse.aad67.NoteCollector_V2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("api/v1/welcome")
public class WelcomeContoller {
    @GetMapping
    public String viewWelcomScreen(Model model) {
        model.addAttribute("message", "Note Collector - V2");
        return "welcome";
    }
}

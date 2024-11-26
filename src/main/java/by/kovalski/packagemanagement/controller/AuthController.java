package by.kovalski.packagemanagement.controller;

import by.kovalski.packagemanagement.model.User;
import by.kovalski.packagemanagement.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute(new User());
        return "auth/register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        authService.register(user);
        return "redirect:/user/main";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute(new User());
        return "auth/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user) {
        authService.login(user.getEmail(), user.getPassword());
        return "redirect:/user/main";
    }
}

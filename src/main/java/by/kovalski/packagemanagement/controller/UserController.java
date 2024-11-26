package by.kovalski.packagemanagement.controller;

import by.kovalski.packagemanagement.model.Package;
import by.kovalski.packagemanagement.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private final PackageService packageService;

    @Autowired
    public UserController(PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping("/main")
    public String mainPage() {
        return "user/main";
    }

    @GetMapping("/new_package")
    public String newPackagePage(Model model) {
        model.addAttribute("package", new Package());
        return "user/new_package";
    }

    @PostMapping("/new_package")
    public String newPackage(@ModelAttribute("package") Package newPackage) {
        packageService.savePackage(newPackage);
        return "redirect:/user/main";
    }
}

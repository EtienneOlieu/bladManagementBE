package controllers;

import org.springframework.web.bind.annotation.RestController;
import services.IAdminService;

@RestController
public class AdminController {

    private IAdminService adminService;

    public AdminController(IAdminService adminService) {
        this.adminService = adminService;
    }
}

package commencis.hr.loginmanagement.loginservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import commencis.hr.loginmanagement.loginservice.model.*;
import commencis.hr.loginmanagement.loginservice.model.role;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
@RestController
public class LoginTestController {

    @GetMapping("test")
    public String test() {

        role roleAdmin, roleManager, roleDefault;
        roleAdmin = new role();
        roleAdmin.setName(HRConstants.Admin_Role);

        roleManager = new role();
        roleManager.setName(HRConstants.Manager_Role);

        roleDefault = new role();
        roleDefault.setName(HRConstants.Default_Role);

        log.info("INFO : {}" , roleAdmin);

        return "LOGIN -->> OK... Done : " + LocalDate.now();

    }  
}

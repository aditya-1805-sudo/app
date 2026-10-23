package com.webapp.app.Service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Getter
@Setter
public class LoginProcessor {
    private String username;
    private String password;
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    @Autowired
    public LoginProcessor(LoggedUserManagementService   loggedUserManagementService, LoginCountService loginCountService){
        this.loggedUserManagementService=loggedUserManagementService;
        this.loginCountService =loginCountService;
    }

    public boolean login(){
        String username=this.username;
        String password=this.password;
        boolean loginResult=false;
        if ("aditya".equals(username) && "bolt".equals(password)) {
            loginResult = true;
            loginCountService.increment();
            loggedUserManagementService.setUsername(username);
        }
        return loginResult;
    }
}

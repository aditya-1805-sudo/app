package com.webapp.app.Service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@Setter
@Getter
@SessionScope
public class LoggedUserManagementService {
    private String username;
}

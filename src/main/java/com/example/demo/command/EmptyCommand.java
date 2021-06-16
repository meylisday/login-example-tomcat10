package com.example.demo.command;

import com.example.demo.resource.ConfigurationManager;
import jakarta.servlet.http.HttpServletRequest;

public class EmptyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        /* в случае ошибки или прямого обращения к контроллеру
         * переадресация на страницу ввода логина */
        return ConfigurationManager.getProperty("path.page.login");
    }

}

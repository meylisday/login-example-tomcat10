package com.example.demo.command.client;

import com.example.demo.command.ActionCommand;
import com.example.demo.command.LoginCommand;
import com.example.demo.command.LogoutCommand;

public enum CommandEnum {
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    };
    ActionCommand command;
    public ActionCommand getCurrentCommand() {
        return command;
    }
}

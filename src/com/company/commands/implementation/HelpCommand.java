package com.company.commands.implementation;

import com.company.commands.contracts.Command;

public class HelpCommand implements Command {
    @Override
    public void execute(String[] args) {

    }

    @Override
    public boolean validateArgs(String[] args) {
        return false;
    }
}

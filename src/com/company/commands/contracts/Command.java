package com.company.commands.contracts;

public interface Command {
    void execute(String[] args);
    boolean validateArgs(String[] args);
}

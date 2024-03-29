package com.company.handlers;

import com.company.commands.contracts.Command;
import com.company.commands.implementation.*;

import java.util.Map;

public class CommandHandler {
    private Map<String, Command> commandMap;

    public CommandHandler(Map<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("open", new OpenFileCommand());
        commandMap.put("close", new CloseFileCommand());
        commandMap.put("save", new SaveFileCommand());
        commandMap.put("saveas", new SaveFileAsCommand());
        commandMap.put("help", new HelpCommand());
        commandMap.put("exit", new ExitCommand());
        commandMap.put("list", new ListCommand());
        commandMap.put("print", new PrintCommand());
        commandMap.put("addRule", new AddRuleCommand());
        commandMap.put("removeRule", new RemoveRuleCommand());
        commandMap.put("union", new UnionCommand());
        commandMap.put("concat", new ConcatCommand());
        commandMap.put("chomsky", new ChomskyCheckCommand());
        commandMap.put("cyk", new CykCommand());
        commandMap.put("iter", new IterCommand());
        commandMap.put("empty", new EmptyCommand());
        commandMap.put("chomskify", new ChomskifyCommand());
    }


    public boolean handleCommand(String command) {
        try {
            String[] parts = command.split(" ");
            Command cmd = commandMap.get(parts[0]);

            if (cmd      != null) {
                String[] args = new String[parts.length - 1];
                System.arraycopy(parts, 1, args, 0, parts.length - 1);
                cmd.execute(args);
  //              return cmd instanceof Exit;
            } else {
                handleInvalidCommand(parts[0]);
            }
        } catch (Exception e) {
            System.out.println("Failed to handle command: " + command);
            e.printStackTrace();
        }
        return false;
    }
    private void handleInvalidCommand(String invalidCommand) {
        System.out.println("'" + invalidCommand + "' is an invalid command. Type 'help' for a list of commands.");
    }
}

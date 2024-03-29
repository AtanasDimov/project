package com.company.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
    private File currentFile;
    private Scanner scanner;

    public void openFile(String fileName){
     try {
         currentFile = new File(fileName);
         scanner = new Scanner(currentFile);
         System.out.println("Successfully opened" + fileName);
     }catch (FileNotFoundException e){
         System.out.println("File not found: "+ fileName);
     }
    }
    public void closeFile() {
        if (scanner != null) {
            scanner.close();
            scanner = null;
            currentFile = null;
            System.out.println("File closed successfully.");
        } else {
            System.out.println("No file opened.");
        }
    }
    public void saveFile() {
        if (currentFile != null) {
            saveToFile(currentFile);
        } else {
            System.out.println("No file opened.");
        }
    }
    public void saveFileAs(String fileName) {
        File file = new File(fileName);
        saveToFile(file);
    }
    private void saveToFile(File file) {
    }

    public Scanner getScanner() {
        return scanner;
    }
}

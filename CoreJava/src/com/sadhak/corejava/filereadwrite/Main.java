package com.sadhak.corejava.filereadwrite;

public class Main {
    public static void main(String[] args) {
    	FileOperations fileManager = new FileOperations();

        String file = "D:/ISS-Assignment-Sadhak/CoreJava/src/com/sadhak/corejava/filereadwrite/myfile.txt";
        String copyFile = "D:/ISS-Assignment-Sadhak/CoreJava/src/com/sadhak/corejava/filereadwrite/myfile_copy.txt";

        // Write to file
        fileManager.writeToFile(file, "Hello from Java File I/O!");

        // Append to file
        fileManager.appendToFile(file, "This is appended content.");

        // Read file
        fileManager.readFromFile(file);

        // Copy file
        fileManager.copyFile(file, copyFile);

        // Delete copied file
//        fileManager.deleteFile(copyFile);
    }
}

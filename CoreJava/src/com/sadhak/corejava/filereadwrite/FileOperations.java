package com.sadhak.corejava.filereadwrite;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileOperations {
	// Write to file (overwrite)
    public void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Written to file: " + filename);
        } catch (IOException e) {
            System.err.println("Write error: " + e.getMessage());
        }
    }

    // Read file
    public void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Reading file: " + filename);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.err.println("Read error: " + e.getMessage());
        }
    }

    // Append to file
    public void appendToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.newLine();
            writer.write(content);
            System.out.println("Appended to file: " + filename);
        } catch (IOException e) {
            System.err.println("Append error: " + e.getMessage());
        }
    }

    // Copy file
    public void copyFile(String sourceFile, String destFile) {
        try {
            Files.copy(Path.of(sourceFile), Path.of(destFile), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied from " + sourceFile + " to " + destFile);
        } catch (IOException e) {
            System.err.println("Copy error: " + e.getMessage());
        }
    }

    // Delete file
    public void deleteFile(String filename) {
        try {
            Files.delete(Path.of(filename));
            System.out.println("Deleted file: " + filename);
        } catch (IOException e) {
            System.err.println("Delete error: " + e.getMessage());
        }
    }
}

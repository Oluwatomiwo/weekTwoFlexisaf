package org.euaggelionscode;

public class Main {
    // Main.java
        public static void main(String[] args) {
            try {
                // Simulate a condition that causes an exception
                performRiskyOperation();
            } catch (CustomException e) {
                // Handle the custom exception
                System.out.println("Caught custom exception: " + e.getMessage());
            }
        }

        public static void performRiskyOperation() throws CustomException {
            boolean errorOccurred = true; // Simulate an error condition

            if (errorOccurred) {
                throw new CustomException("Something went wrong!");
            }

            // Normal operation code (if no error)
            System.out.println("Operation completed successfully.");
        }
    }

package toScratch;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String name;
    private int id;

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Billing {
    private int billId;
    private Patient patient;
    private double amount;

    public Billing(int billId, Patient patient, double amount) {
        this.billId = billId;
        this.patient = patient;
        this.amount = amount;
    }

    public int getBillId() {
        return billId;
    }

    public Patient getPatient() {
        return patient;
    }

    public double getAmount() {
        return amount;
    }
}

public class patientBilling {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Billing> bills = new ArrayList<>();
    private static int nextBillId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. Generate Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPatient(scanner);
                    break;
                case 2:
                    generateBill(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addPatient(Scanner scanner) {
        System.out.print("Enter patient name: ");
        String name = scanner.next();
        System.out.print("Enter patient ID: ");
        int id = scanner.nextInt();

        Patient newPatient = new Patient(name, id);
        patients.add(newPatient);

        System.out.println("Patient added successfully.");
    }

    private static void generateBill(Scanner scanner) {
        System.out.print("Enter patient ID for billing: ");
        int patientId = scanner.nextInt();
        Patient patient = findPatientById(patientId);

        if (patient != null) {
            double amount = Math.random() * 1000; // Replace with your billing logic
            Billing newBill = new Billing(nextBillId++, patient, amount);
            bills.add(newBill);

            System.out.println("Bill generated successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    private static Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }
}

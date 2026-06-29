package com.bridgelabz.clinicops.util;

import com.bridgelabz.clinicops.model.Doctor;
import com.bridgelabz.clinicops.model.Shift;
import com.bridgelabz.clinicops.model.Specialization;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private static final Logger logger = LogManager.getLogger(FileHandler.class);

    private FileHandler() {
    }

    public static List<Doctor> loadDoctors(String filePath, int startingId, List<Doctor> existingDoctors) {
        List<Doctor> doctors = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] record;
            int idCounter = startingId;
            while ((record = reader.readNext()) != null) {
                if (record.length != 4) {
                    System.out.println("Skipping Invalid Record");
                    continue;
                }
                try {
                    String name = record[0].trim();
                    Specialization specialization = Specialization.valueOf(record[1].trim().toUpperCase());
                    int experience = Integer.parseInt(record[2].trim());
                    Shift shift = Shift.valueOf(record[3].trim().toUpperCase());
                    // Duplicate Check
                    boolean duplicate = existingDoctors.stream().anyMatch(doctor ->
                            doctor.getName().equalsIgnoreCase(name)
                                    && doctor.getSpecialization() == specialization
                                    && doctor.getExperience() == experience);
                    if (duplicate) {
                        System.out.println("Duplicate Doctor Skipped : " + name);
                        continue;
                    }
                    String doctorId = String.format("D%04d", idCounter++);
                    doctors.add(new Doctor(doctorId, name, specialization, experience, shift));
                } catch (IllegalArgumentException exception) {
                    System.out.println("Invalid Specialization/Shift : " + String.join(",", record));
                }
            }
        } catch (IOException | CsvValidationException exception) {
            logger.error("CSV Upload Failed", exception);
            System.out.println("Unable to Read File.");
        }
        return doctors;
    }
}
package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {

    NaiveCsvReader naiveCsvReader;
    ProfileService profileService;

    CsvProfileImporter(NaiveCsvReader naiveCsvReader, ProfileService profileService) {
        this.naiveCsvReader = naiveCsvReader;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> profiles = naiveCsvReader.read(csvFile);
        for (String[] row : profiles) {
            if (row.length >= 3) {
                String id = row[0];
                String email = row[1];
                String displayName = row[2];
                profileService.createProfile(id, email, displayName);
            }
        }
        return profiles.size();
    }

}

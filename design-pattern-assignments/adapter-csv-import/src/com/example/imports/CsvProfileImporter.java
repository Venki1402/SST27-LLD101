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
        return profiles.size();
    }

}

package exercise;

class EmployeeCSVAdapter implements Employee {
    EmployeeCSV e;

    EmployeeCSVAdapter(EmployeeCSV e) {
        this.e = e;
    }

    @Override
    public String getId() {
        String[] tokens = e.tokens();
        return tokens.length > 0 ? tokens[0] : null;
    }

    @Override
    public String getFirstName() {
        String[] tokens = e.tokens();
        return tokens.length > 1 ? tokens[1] : null;
    }

    @Override
    public String getLastName() {
        String[] tokens = e.tokens();
        return tokens.length > 2 ? tokens[2] : null;
    }

    @Override
    public String getEmail() {
        String[] tokens = e.tokens();
        return tokens.length > 3 ? tokens[3] : null;
    }

}
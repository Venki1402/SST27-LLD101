public class ReportService {
    ConsoleLogger logger;

    ReportService(ConsoleLogger logger) {
        this.logger = logger;
    }

    void generate() {
        // ConsoleLogger logger = new ConsoleLogger();
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}
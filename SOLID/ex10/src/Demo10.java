public class Demo10 {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        ReportService reportService = new ReportService(consoleLogger);
        reportService.generate();
    }
}

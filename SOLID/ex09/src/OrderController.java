public class OrderController {
    SqlOrderRepository repo;

    OrderController(SqlOrderRepository repo) {
        this.repo = repo;
    }

    void create(String id) {
        // SqlOrderRepository repo = new SqlOrderRepository(); // hard dependency
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}
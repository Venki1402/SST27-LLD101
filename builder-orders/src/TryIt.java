import com.example.orders.*;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);
        Order o = new Order.OrderBuilder("o2", "a@b.com").addLine(l1).addLine(l2).setDiscountPercent(10).build();
        // o.addLine(l1);
        // o.addLine(l2);
        // o.setDiscountPercent(10);
        System.out.println("Before: " + o.totalAfterDiscount());
        l1.setQuantity(999); // demonstrates mutability leak
        l1.setQuantity(888);
        System.out.println("After:  " + o.totalAfterDiscount());
        System.out.println("=> In the solution, totals remain stable due to defensive copies.");
        System.out.println(o.getLines().get(0).getQuantity());
        System.out.println(l1.getQuantity());
    }
}

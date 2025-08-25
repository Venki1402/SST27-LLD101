
public class Square implements Shape {
    int size;

    void setSize(int size) {
        this.size = size;
    }

    @Override
    public int area() {
        return size * size;
    }
}
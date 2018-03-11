import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant1 {

    HotDrink tea;

    public HotDrink getTea() {
        return tea;
    }

    public void setTea(HotDrink tea) {
        this.tea = tea;
    }

    @Override
    public String toString() {
        return "Restaurant1{" +
                "tea=" + tea +
                '}';
    }

    public Restaurant1(HotDrink tea) {
        this.tea = tea;
    }
}

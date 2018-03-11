import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant2 {

//    @Autowired
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

//    @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {
        return "Restaurant2{" +
                "hotDrink=" + hotDrink +
                '}';
    }

    @Autowired
    public Restaurant2(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}

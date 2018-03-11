import org.springframework.stereotype.Component;

class Tea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("preparing tea.");
    }
}

package ques10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config3.xml");
        Restaurant restaurant = (Restaurant) applicationContext.getBean(Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
    }
}

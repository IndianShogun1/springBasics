import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Database database = (Database) applicationContext.getBean("database");
        System.out.println(database);

        HotDrink tea = (HotDrink) applicationContext.getBean("tea");
        HotDrink expressTea = (HotDrink) applicationContext.getBean("expressTea");
        tea.prepareHotDrink();
        expressTea.prepareHotDrink();

        Restaurant restaurant = (Restaurant) applicationContext.getBean("expressTeaRestaurant");
        restaurant.getHotDrink().prepareHotDrink();

        Complex complex = (Complex) applicationContext.getBean("complexBean");
        System.out.println(complex);

        boolean isPrototype =  applicationContext.isPrototype("teaRestaurant");
        System.out.println(isPrototype);

        Restaurant restaurantAutoWired = (Restaurant) applicationContext.getBean("restaurantAutoWired");
        System.out.println(restaurantAutoWired);
    }
}

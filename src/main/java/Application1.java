import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config1.xml");
        Restaurant1 restaurant1 = (Restaurant1) applicationContext.getBean("restaurant1");
        restaurant1.getTea().prepareHotDrink();
    }
}

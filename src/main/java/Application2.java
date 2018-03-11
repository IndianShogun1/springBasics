import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config2.xml");
        Restaurant2 restaurant2 = (Restaurant2) applicationContext.getBean("restaurant2");
        restaurant2.getHotDrink().prepareHotDrink();
    }
}

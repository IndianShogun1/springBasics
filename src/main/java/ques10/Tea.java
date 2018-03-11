package ques10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Service
@Repository
public class Tea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("preparing tea.");
    }
}

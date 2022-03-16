package am.training.spring;

import am.training.beans.HorseRider;
import am.training.beans.Race;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HorseRider horseRider1 = (HorseRider) context.getBean("horseRider1");
        List<HorseRider> horseRiders = (List<HorseRider>) context.getBean("horseList");
        List<Race> raceList = (List<Race>) context.getBean("raceList");

        System.out.println(horseRider1);
        System.out.println(horseRiders);
        System.out.println(raceList);

    }
}

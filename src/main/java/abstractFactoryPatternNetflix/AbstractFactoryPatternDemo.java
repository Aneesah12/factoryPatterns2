package abstractFactoryPatternNetflix;

import abstractFactoryPatternNetflix.domain.NetflixCatalogue;
import abstractFactoryPatternNetflix.domain.NetflixDetails;
import abstractFactoryPatternNetflix.infrastructure.AbstractFactory;
import abstractFactoryPatternNetflix.infrastructure.FactoryProducer;

import java.util.Collections;
import java.util.Scanner;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        String response;
        String showType;
        String show;
        int rating;

        System.out.println("Are you looking to add a Netflix Movie - please answer Yes or No");
        Scanner myNetflixInfo = new Scanner(System.in);
        response = myNetflixInfo.nextLine();

        AbstractFactory netflixShowFactory = FactoryProducer.getFactory(response);

        System.out.println("What is the genre of your show: ROMCOM, ACTION or SCIENCE_FICTION?");
        showType = myNetflixInfo.nextLine();

        System.out.println("What is the name of your show?");
        show = myNetflixInfo.nextLine();

        System.out.println("What rating would you give your show?");
        rating = Integer.parseInt(myNetflixInfo.nextLine());

        assert netflixShowFactory != null;
        NetflixCatalogue netflixCatalogue1 = netflixShowFactory.getShowInfo(showType, Collections.singletonList(new NetflixDetails(show, rating)));
        System.out.println(netflixCatalogue1);
    }
}

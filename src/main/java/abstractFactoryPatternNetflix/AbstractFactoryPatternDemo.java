package abstractFactoryPatternNetflix;

import java.util.Scanner;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //TODO: Need to find a way to select the factory we want to use/produce
        //TODO: Need to then get the subclass/genre from that factory

        String response;
        String showType;
        String show;
        int rating;

        System.out.println("Are you looking to add a Netflix Movie - please answer Yes or No");
        Scanner myNetflixFactory = new Scanner(System.in);

        System.out.println("What is the genre of your show: ROMCOM, ACTION or SCIENCE_FICTION?");

        System.out.println("What is the name of your show?");

        System.out.println("What rating would you give your show?");

    }
}

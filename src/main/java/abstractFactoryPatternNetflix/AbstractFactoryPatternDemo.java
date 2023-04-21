package abstractFactoryPatternNetflix;

import java.util.Scanner;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        String response;
        String showType;
        String show;
        int rating;

        System.out.println("Are you looking to add a Netflix Movie - please answer Yes or No");
        Scanner myNetflixInfo = new Scanner(System.in);

        System.out.println("What is the genre of your show: ROMCOM, ACTION or SCIENCE_FICTION?");

        System.out.println("What is the name of your show?");

        System.out.println("What rating would you give your show?");

    }
}

package abstractFactoryPatternNetflix.infrastructure;

public class FactoryProducer {
    public static AbstractFactory getFactory(String response) {
        if(response.equalsIgnoreCase("Yes")) {
            return new MovieFactory();
        } else if (response.equalsIgnoreCase("No")){
            return new TvShowFactory();
        } else {
            return null;
        }

    }
}

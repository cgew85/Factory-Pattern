package io.github.cgew85;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryPatternApplication.class, args);
        final CocktailFactory cocktailFactory = new CocktailFactory();

        Cocktail whiteRussian = cocktailFactory.getCocktail(CocktailFactory.WHITE_RUSSIAN);
        whiteRussian.mix();

        Cocktail longIslandIceTea = cocktailFactory.getCocktail(CocktailFactory.LONG_ISLAND_ICE_TEA);
        longIslandIceTea.mix();

        Cocktail zombie = cocktailFactory.getCocktail(CocktailFactory.ZOMBIE);
        zombie.mix();
    }
}

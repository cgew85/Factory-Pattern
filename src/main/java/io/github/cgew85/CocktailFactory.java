package io.github.cgew85;

/**
 * Created by cgew85 on 23.10.2016.
 */
public class CocktailFactory {

    public static final String WHITE_RUSSIAN = "WHITE_RUSSIAN";
    public static final String LONG_ISLAND_ICE_TEA = "LONG_ISLAND_ICE_TEA";
    public static final String ZOMBIE = "ZOMBIE";

    public Cocktail getCocktail(final String chosenCocktail) {
        if (chosenCocktail == null) {
            return null;
        }
        if (chosenCocktail.equalsIgnoreCase(WHITE_RUSSIAN)) {
            return new WhiteRussian();
        } else if (chosenCocktail.equalsIgnoreCase(LONG_ISLAND_ICE_TEA)) {
            return new LongIslandIceTea();
        } else if (chosenCocktail.equalsIgnoreCase(ZOMBIE)) {
            return new Zombie();
        }

        return null;
    }
}
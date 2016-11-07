package io.github.cgew85;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryPatternApplicationTests {

    private CocktailFactory cocktailFactory;

    @Before
    public void setup() {
        cocktailFactory = new CocktailFactory();
    }

    @Test
    public void isInstanceOfZombie() {
        Cocktail zombie = cocktailFactory.getCocktail(CocktailFactory.ZOMBIE);
        Assert.assertTrue(zombie instanceof Zombie);
    }

    @Test
    public void isNotInstanceOfZombie() {
        Cocktail notZombie = cocktailFactory.getCocktail(CocktailFactory.WHITE_RUSSIAN);
        Assert.assertFalse(notZombie instanceof Zombie);
    }
}

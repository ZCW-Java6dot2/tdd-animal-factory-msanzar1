package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {



    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCat() {
        String name = "Garfield";
        Date birthDate = new Date();
        Integer catId = 0;

        Cat garfield = new Cat(name, birthDate, catId);

        CatHouse.add(garfield);

        Cat actualGarfield = CatHouse.getCatById(catId);
        assertEquals(garfield,actualGarfield);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCat() {
        Cat whisky = new Cat("Whisky", null, 0);
        CatHouse.add(whisky);
        CatHouse.remove(0);

        Cat rescueCat = CatHouse.getCatById(0);

        assertNull(rescueCat);


    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByCatName() {
        Cat whisky = new Cat("Whisky", null, 0);
        CatHouse.add(whisky);
        CatHouse.remove(whisky);

        Cat rescueCat = CatHouse.getCatById(0);

        assertNull(rescueCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        // given there is a cat to be added
        Cat cat = new Cat();
        // given that I count number of cats before add
        int numberOfCatsBeforeAdd = CatHouse.getNumberOfCats();
        // given that I add one cat, my expected should be numberOfCatsBeforeAdd + 1
        int expected = numberOfCatsBeforeAdd + 1;
        // given that I have added a cat
        CatHouse.add(cat);
        // when I get the number of cats after the add
        int actual = CatHouse.getNumberOfCats();
        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getCatById(){
        String name = "Garfield";
        Date birthDate = new Date();
        Integer catId = 0;

        Cat garfield = new Cat(name, birthDate, catId);

        CatHouse.add(garfield);

        Cat actualGarfield = CatHouse.getCatById(catId);
        assertEquals(garfield,actualGarfield);
    }
    }

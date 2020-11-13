package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    @Test
    public void addDog() {
        String name = "milo";
        Date birthDate = new Date();
        Integer dogId = 0;

        Dog milo = new Dog(name, birthDate, dogId);

        DogHouse.add(milo);

        Dog actualMilo = DogHouse.getDogById(dogId);
        assertEquals(milo,actualMilo);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDog() {
        Dog fido = new Dog("fido", null, 0);
        DogHouse.add(fido);
        DogHouse.remove(0);

        Dog rescueDog = DogHouse.getDogById(0);

        assertNull(rescueDog);


    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByDogName() {
        Dog fido = new Dog("fido", null, 0);
        DogHouse.add(fido);
        DogHouse.remove(fido);

        Dog rescueCat = DogHouse.getDogById(0);

        assertNull(rescueCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfDogsTest() {
        // given there is a cat to be added
        Dog dog = new Dog(null,null,null);
        // given that I count number of cats before add
        int numberOfDogsBeforeAdd = DogHouse.getNumberOfDogs();
        // given that I add one cat, my expected should be numberOfCatsBeforeAdd + 1
        int expected = numberOfDogsBeforeAdd + 1;
        // given that I have added a cat
        DogHouse.add(dog);
        // when I get the number of cats after the add
        int actual = DogHouse.getNumberOfDogs();
        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getDogById(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer catId = 0;

        Dog milo = new Dog(name, birthDate, catId);

        DogHouse.add(milo);

        Dog actualMilo = DogHouse.getDogById(catId);
        assertEquals(milo,actualMilo);
    }
}
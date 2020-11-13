package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;
import static org.junit.Assert.assertEquals;
/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        String name = "Buddy";
        Date birthDate = new Date();
        Integer dogId = 0;

        Dog dog = AnimalFactory.createDog(name,birthDate);

        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        Integer actualDogId = dog.getId();

        assertEquals(name,actualName);
        assertEquals(birthDate, actualBirthDate);
        assertEquals(dogId, actualDogId);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        String name = "Ron";
        Date birthDate = new Date();
        Integer catId = 0;

        Cat cat = AnimalFactory.createCat(name,birthDate);

        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();
        Integer actualDogId = cat.getId();

        assertEquals(name,actualName);
        assertEquals(birthDate, actualBirthDate);
        assertEquals(catId, actualDogId);
}}

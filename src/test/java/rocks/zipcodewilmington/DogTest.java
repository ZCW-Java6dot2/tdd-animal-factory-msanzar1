package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog dog;

    @Before
    public void setup() {
        this.dog = new Dog(null,null,null);
    }
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // given
        String expected = "Mighty";
        // when
        dog.setName(expected);
        // then
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        String expected = "bark!";
        // when
        String actual = dog.speak();
        // then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // given
        Date expected = new Date();
        // when
        dog.setBirthDate(expected);
        // then
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // given
        Food food = new Food();
        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;
        // when
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();
        // then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void implementTest() {
        // given
        Dog dog = new Dog(null,null,null);
        // when
        boolean outcome = dog instanceof Animal;
        // then
        Assert.assertTrue(outcome);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceTest() {
        // given
        Dog dog = new Dog(null,null,null);
        // when
        boolean outcome = dog instanceof Mammal;
        // then
        Assert.assertTrue(outcome);
    }
    @Test
    public void idTest(){
        Integer idNum = 0;
        Dog dog = new Dog("", new Date(), idNum);

        Integer actualId = dog.getId();

        Assert.assertEquals(idNum,actualId);
    }
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Mula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName); //
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}

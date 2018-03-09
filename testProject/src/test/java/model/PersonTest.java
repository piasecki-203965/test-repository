package model;

import org.junit.Assert;
import org.junit.Test;
import pl.lodz.p.test.model.Person;

public class PersonTest {

    @Test
    public void testConstructor() {
        Person person = new Person(25, "Jack");
        Assert.assertEquals(person.getAge(), 25);
        Assert.assertEquals(person.getName(), "Jack");
    }

}

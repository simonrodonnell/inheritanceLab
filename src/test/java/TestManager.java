import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class TestManager {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "AB123456C", 23999.50, "Human Resources");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetInsuranceNumber(){
        assertEquals("AB123456C", manager.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(23999.50, manager.getSalary(), 0.01);

    }
}

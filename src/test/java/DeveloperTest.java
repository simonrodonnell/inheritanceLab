import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Aaron", "DE789012F", 19999.99);
    }

    @Test
    public void canGetName(){
        assertEquals("Aaron", developer.getName());
    }

    @Test
    public void canGetInsuranceNumber(){
        assertEquals("DE789012F", developer.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(19999.99, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(9000.00);
        assertEquals(28999.99, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        developer.payBonus();
        assertEquals(199.9999, developer.payBonus(), 0.01);
    }

}

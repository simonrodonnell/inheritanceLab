import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class TestManager {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager(
                "Bob",
                "AB123456C",
                23999.50,
                "Human Resources"
        );
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

    @Test
    public void canGetDeptName(){
        assertEquals("Human Resources", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000.00);
        assertEquals(28999.50, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(239.995, manager.payBonus(), 0.01);
    }
}

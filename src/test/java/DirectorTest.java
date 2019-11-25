import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director(
                "Frank",
                "XX999999X",
                83999.50,
                "CEO",
                1000000.00
        );
    }

    @Test
    public void canGetName(){
        assertEquals("Frank", director.getName());
    }

    @Test
    public void canGetInsuranceNumber(){
        assertEquals("XX999999X", director.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(83999.50, director.getSalary(), 0.01);

    }

    @Test
    public void canGetDeptName(){
        assertEquals("CEO", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000.00);
        assertEquals(93999.50, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1679.99, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canChangeNameTrue(){
        director.setName("Alice");
        assertEquals("Alice", director.getName());
    }

    @Test
    public void canChangeNameFalse(){
        director.setName("");
        assertEquals("Frank", director.getName());
    }

}

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Eric", "GH123456I", 30000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Eric", databaseAdmin.getName());
    }

    @Test
    public void canGetInsuranceNumber(){
        assertEquals("GH123456I", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(9000.00);
        assertEquals(39000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        databaseAdmin.payBonus();
        assertEquals(300.00, databaseAdmin.payBonus(), 0.01);
    }
}

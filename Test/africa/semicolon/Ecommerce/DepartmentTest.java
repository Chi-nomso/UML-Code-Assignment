package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentTest {
    @Test
    public void testThatSystemAcceptsDepartmentID(){
        Department myDepartment = new Department();
        myDepartment.setDepartmentId (55444);
        assertEquals(55444, myDepartment.getDepartmentId());
    }

    @Test
    public void testThatSystemAcceptsName(){
        Department myDepartment = new Department();
        myDepartment.setDepartmentname("Chinomso");
        assertEquals("Chinomso", myDepartment.getDepartmentname());
    }

    @Test
    public void testThatSystemHasDescription(){
        Department myDepartment = new Department();
        myDepartment.setDepartmentdescription("All things Fabric");
        assertEquals("All things Fabric",  myDepartment.getDepartmentdescription());
    }
}

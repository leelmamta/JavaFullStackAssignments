package org.example;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest  {

    @Test
    public void testEqualsOrNotEquals(){
        JDBCAPIDemo app = new JDBCAPIDemo();
        String message = "Add is working ";
        assertEquals(message, 10, app.add(6, 4));
        Assert.assertNotSame(message, 6, app.add(2,3));
    }
}

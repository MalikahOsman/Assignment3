package za.ac.cput.malikah;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Malikah Osmen on 2016-03-12.
 */
public class TestMyLists {
    @Test
    public void testList() throws Exception {
        MyLists list = new MyLists();

        assertEquals("Western Cape", list.provinces().get(1));
    }

    @Test
    public void testSet() throws Exception {
        MyLists set = new MyLists();
        assertEquals(5, set.firstNames().size());
    }

    @Test
    public void testMap() throws Exception {
        MyLists map = new MyLists();
        Assert.assertEquals(5, map.person().size());
       Assert.assertEquals("Yusrah", map.person().get("2"));
    }
}

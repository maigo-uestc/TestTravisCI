package com.example.travisci;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by binyang.dby on 2016/6/17.
 */
public class TravisTest {
    @Test
    public void testTravis()
    {
        Travis travis = new Travis();
        assertEquals(1, travis.testMethod1());
    }
}

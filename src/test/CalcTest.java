package test;

import gen.Calc;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void sum() {

        assertEquals(13,new Calc().sum(5,8));
    }
}
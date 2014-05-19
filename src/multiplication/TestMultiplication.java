/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiplication;
import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author Екатерина
 */
public class TestMultiplication {
    @Test(expected = Exception.class)
    public void testMult(){
        op_multiplication val1 = new op_multiplication(3);
        op_multiplication val2 = new op_multiplication(3);
        op_multiplication exp = new op_multiplication(9);
        op_multiplication res = val1.mult(val2);
        
        
        assertEquals(res,exp);
        assertEquals(new op_multiplication(4).mult(new op_multiplication(5)),new op_multiplication(20));
        assertNotNull(val1);
        assertNotNull(val2);
       
    }
}

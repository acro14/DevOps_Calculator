import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigInteger;
public class calc_Test{
    need calc=new need();
    @Test
    public void logTruePositive(){
        assertEquals("Finding the log of double number",1.6789639750,calc.log(5.36),10);
        assertEquals("finding the log of integer number",1.6094379124341003,calc.log(5),10);
    }
    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding the log of double number",1.7789639750,calc.log(5.36));
        assertNotEquals("finding the log of integer number",1.7094379124341003,calc.log(5));
    }
    @Test
    public void sqrtTruePositive(){
        assertEquals("Finding the sqrt of double number",2.3151673805580453,calc.sqrt(5.36),10);
        assertEquals("finding the sqrt of integer number",2.23606797749979,calc.sqrt(5),10);
    }
    @Test
    public void sqrtFalsePositive(){
        assertNotEquals("Finding the sqrt of double number false ",1.7789639750,calc.sqrt(5.36));
        assertNotEquals("finding the sqrt of integer number false",1.7094379124341003,calc.sqrt(5));
    }
    @Test
    public void factTruePositive(){
        BigInteger bd1=calc.fact(5);
        int n=120;
        BigInteger big1 = BigInteger.valueOf(n);
        assertTrue(bd1.compareTo(big1)==0);
        int m=1;
        BigInteger big2 = BigInteger.valueOf(m);
        BigInteger bd2=calc.fact(0);
        assertTrue(bd2.compareTo(big2)==0);
    }
    @Test
    public void factFalsePositive(){
        BigInteger bd1=calc.fact(5);
        int n=60;
        BigInteger big1 = BigInteger.valueOf(n);
        assertFalse(bd1.compareTo(big1)==0);
        int m=100;
        BigInteger big2 = BigInteger.valueOf(m);
        BigInteger bd2=calc.fact(0);
        assertFalse(bd2.compareTo(big2)==0);
    }
    @Test
    public void powTruePositive(){
        assertEquals("Finding the power of double number",20.054886556091958,calc.power(2.3,3.6),10);
        assertEquals("finding the power of integer number",8,calc.power(2,3),10);
    }
    @Test
    public void powFalsePositive(){
        assertNotEquals("Finding the power of double number false ",21.054886556091958,calc.power(2.3,5.6));
        assertNotEquals("finding the power of integer number false",123,calc.power(12,0));
    }
}
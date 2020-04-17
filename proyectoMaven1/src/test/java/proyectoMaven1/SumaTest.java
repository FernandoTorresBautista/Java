package proyectoMaven1;

import org.junit.*;
import static org.junit.Assert.*;

public class SumaTest {
	/*
	@Test
	public void sumaPositivos() {
		System.out.println("Suma de dos números positivos");
		Suma s1 = new Suma(2, 4);
		// Validate that X is true
		assertTrue("son iguales", s1.sumar()==6);
		System.out.println("La suma es : " + s1.sumar());
		// Validate that X & Y use the same equals() method
		assertEquals("son iguales", s1.sumar(), 6);
		// assertSame("message",X,Y) -> Validate that X & Y are the same object using ==
		// assertNotNull("message", A)
	}
	*/
	/*
	 * Anotaciones para ejecutar funciones en determinado momento:
	@BeforeClass 
	@Before
	@AfterClass 
	@After
	*/
	
	Suma op1;
	
	@Before
	public void inicializa() {
		op1 = new Suma(2, 4);
	}
	
	@Test
	public void sumaPositivos() {
		System.out.println("Test1 Suma de 2 números positivos");
		assertTrue("son iguales", op1.sumar()==6);
		System.out.println("La suma: " + op1.sumar());
		assertEquals("son iguales", op1.sumar(), 6);
	}
	
	@After
	public void sumaNegativos() {
		Suma op2 = new Suma(-2,-3);
		System.out.println("Test2 Suma de 2 números negaivos");
		assertTrue("son iguales", op2.sumar()==-5);
		System.out.println("La suma es: " + op2.sumar());
		assertEquals("son iguales", op2.sumar(), -5);
	}
	
	// Test timeout()
	@Ignore(value="Es una prueba")
	@Test(timeout=100)
	public void sumaTimeOut() {
		assertTrue("Suma igual a 6 con time out", op1.sumar()==6);
		System.out.println("La suma: " + op1.sumar());
	} 
}

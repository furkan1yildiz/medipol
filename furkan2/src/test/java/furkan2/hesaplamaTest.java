package furkan2;



import org.junit.*;



public class hesaplamaTest {
	@Test
	public void testToplahatalisayilar() {
		String sayi1 = "100x";
		String sayi2 ="42.3";
		String sonuc = hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("undefined", sonuc);
		
	}
	@Test
	public void testToplaondalıksayilar() {
		String sayi1 = "100.5";
		String sayi2 ="42.3";
		String sonuc = hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("142.8", sonuc);
		
	}
	@Test
	public void testToplatamsayilar() {
		String sayi1 = "100";
		String sayi2 ="42";
		String sonuc = hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("142", sonuc);
		
	}

}

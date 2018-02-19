package Lokesh.CsvRead;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import csvRead.QueryRead;

@RunWith(JUnitPlatform.class)
public class QueryTest {
	
	QueryRead qr;
	
	@BeforeEach
	public void obj() {
		qr=new QueryRead();
	}
	
	@Test
	public void testquery() {
		
	}
	
	@AfterEach
	public void close() {
		qr = null;
	}
}

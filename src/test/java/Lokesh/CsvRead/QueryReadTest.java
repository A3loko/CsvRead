package Lokesh.CsvRead;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import csvRead.QueryRead;


@RunWith(JUnitPlatform.class)
public class QueryReadTest {
	QueryRead qr;
	
	@BeforeAll
	static void first() {
		System.out.println("Begining");
	}
	
	@BeforeEach
	void read() {
		qr = new QueryRead();
	}
	
	@Test
	void tokenTest() {
		String query = "select id from everything";
		String[] expected = {" select","id","from","everything "};
		String[] result = qr.token();
		Assert.assertArrayEquals( expected, result);
	}
	
	@AfterEach
	void close() {
		qr=null;
	}
	
	@AfterAll
	static void last() {
		System.out.println("Done");
	}
}

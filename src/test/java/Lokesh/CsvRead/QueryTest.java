package Lokesh.CsvRead;

import csvRead.QueryRead;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class QueryTest {
		static QueryRead qp;
		
		@BeforeAll
		static void init() {
			System.out.println("Begining");
		}
		
		@BeforeEach
		void beforeEach() {
			qp = new QueryRead();
		}
		
		@Test
		public void columnTest() {
			String query = "select id from everything";
			String[] expected = {" select","id","from","everything "};
			String[] result = qp.token();
			Assert.assertArrayEquals( expected, result);
		}
		
		@Test
		public void columnsTest() {
			String query = "select name,city,wickets from everything";
			String[] expected = {" name","city","wickets "};
			String[] result = qp.columns();
			Assert.assertArrayEquals( expected, result);
		}
		
		@Test
		public void fileNameTest() {
			String query = "select * from csv where this = 3";
			String expected = "csv";
			String result = qp.fileName();
			Assert.assertEquals(expected, result);
		}
		
		
		@AfterEach
		void afterEach() {
			qp = null;
		}
		
		@AfterAll
		static void end() {
			System.out.println("This is the end");
		}
}

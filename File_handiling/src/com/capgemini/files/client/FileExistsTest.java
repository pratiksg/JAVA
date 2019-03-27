package com.capgemini.files.client;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class FileExistsTest {

	
	@BeforeClass
	public static void setUp() {
		FileExists fs= new FileExists();
		}
	
	@Test
	public void testFileExists() {
		FileExists fs= new FileExists();
		
		assertEquals(false, fs.checkExists());
	}
	@Test
	public void testFileNotExists() {
		FileExists fs= new FileExists();
		assertEquals(false, fs.checkExists());
	}
}

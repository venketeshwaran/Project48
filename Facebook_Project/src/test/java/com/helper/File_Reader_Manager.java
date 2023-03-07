package com.helper;

import java.io.IOException;

public class File_Reader_Manager {
	
	
	public static Configuration_Reader getInstance_Cr() throws IOException {

		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}

}

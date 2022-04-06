package adactin.co;

import java.io.IOException;


public class File_Read_Manager {

	
	public File_Read_Manager() {
		// TODO Auto-generated constructor stub
	}
	public static File_Read_Manager getInstance() {
		File_Read_Manager a=new File_Read_Manager();
		return a;
	}
	public conf_Reader getInstanceA() throws IOException {
		conf_Reader b=new conf_Reader();
		return b;
	}
	}

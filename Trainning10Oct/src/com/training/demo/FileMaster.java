package com.training.demo;

import java.io.File;
import java.io.IOException;


public class FileMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File obj = new File("prasa.txt");
		
		try
		{
			obj.createNewFile();
		}
       catch (IOException e) {
        }
	}

}

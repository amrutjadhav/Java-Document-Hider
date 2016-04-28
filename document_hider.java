//package hider;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;

public class document_hider {
	static JFileChooser fileChooser = new JFileChooser();
	static JFileChooser photoChooser=new JFileChooser();
	static Process p;
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		String file,photo;
	//fileChooser.setCurrentDirectory(new File(System.getProperty("/")));
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
	 fileChooser.showOpenDialog(fileChooser);
	 
	    File selectedFile = fileChooser.getSelectedFile();
	    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
	     file=selectedFile.getAbsolutePath();
	     
	     
	
	photoChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
	photoChooser.showOpenDialog(photoChooser);
	//if(result1==JFileChooser.APPROVE_OPTION){
		File selectedPhoto=photoChooser.getSelectedFile();
		 photo=selectedPhoto.getAbsolutePath();
		System.out.println("Selected photo: "+photo);
		String output_name=selectedPhoto.getName();
		String output="/home/atom/hider/"+output_name;
		 
		
		
	//}
		//Runtime.getRuntime().exec("E:");
		String command="cat " +photo+ " " +file+ " >> " + output;
		System.out.println("cat " +photo+ " " +file+ " >> " + output);
	Runtime.getRuntime().exec(new String[]{"bash","-c",command});
	
	}
}


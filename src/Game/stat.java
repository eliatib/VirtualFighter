package Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class stat {

	private int a,b,c,d,VL=0;
	
	public void write(int a,int b,int c, int d) //Write or rewrite in the stat.txt file the data depending of the result of the game.
	{
	try {
		this.a=this.a+a; //add result to the result variables
		this.b=this.b+b; //idem
		this.c=this.c+c; //idem
		this.d=this.d+d; //idem
		PrintWriter fichier = new PrintWriter(new FileWriter("stat.txt" ), false); //allow to write into the file stat.txt
		fichier.println(VL-10);
		if(this.a<10){fichier.println("Fighter : 0"+this.a+"  Win" );} //add the result of the game
		else{fichier.println("Fighter : "+this.a+"  Win" );}
		if(this.b<10){fichier.println("Healer  : 0"+this.b+"  Win" );} //idem
		else{fichier.println("Healer  : "+this.b+"  Win" );}
		if(this.c<10){fichier.println("Tank    : 0"+this.c+"  Win" );} //idem
		else{fichier.println("Tank    : "+this.b+"  Win" );}
		if(this.d<10){fichier.println("Vampire : 0"+this.d+"  Win" );} //idem
		else{fichier.println("Vampire : "+this.b+"  Win" );}
		fichier.close(); //close the file
		}
		catch(Exception e) {}
	}
	
	public void takeVariable() //allow to take the result variables to add the result
	{
		String stat=null;
		BufferedReader br;
		int i=0;
		try {
			br = new BufferedReader(new FileReader("stat.txt")); //allow to read the file stat.txt
			String line;
			line = br.readLine();
			VL = 10+Integer.parseInt(line);
			while ((line = br.readLine()) != null) 
			{
				stat=line.substring(10,VL);
				if (i==0){a = Integer.parseInt(stat);} //recover the result part of the file
				if (i==1){b = Integer.parseInt(stat);} //idem
				if (i==2){c = Integer.parseInt(stat);} //idem
				if (i==3){d = Integer.parseInt(stat);} //idem
				i++;			
			}
			br.close(); //close the file
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print() //print the result into the console
	{
		System.out.println("Fighter : "+a+" Win");
		System.out.println("Healer : "+b+" Win");
		System.out.println("Tank : "+c+" Win");
		System.out.println("Vampire : "+d+" Win");
	}
}



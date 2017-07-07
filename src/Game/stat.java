package Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class stat {

	private int a,b,c,d,VL=0;
	
	public void write(int a,int b,int c, int d)
	{
	try {
		this.a=this.a+a;
		this.b=this.b+b;
		this.c=this.c+c;
		this.d=this.d+d;
		PrintWriter fichier = new PrintWriter(new FileWriter("stat.txt" ), false);
		fichier.println(VL-10);
		if(this.a<10){fichier.println("Fighter : 0"+this.a+"  Win" );}
		else{fichier.println("Fighter : "+this.a+"  Win" );}
		if(this.b<10){fichier.println("Healer  : 0"+this.b+"  Win" );}
		else{fichier.println("Healer  : "+this.b+"  Win" );}
		if(this.c<10){fichier.println("Tank    : 0"+this.c+"  Win" );}
		else{fichier.println("Tank    : "+this.b+"  Win" );}
		if(this.d<10){fichier.println("Vampire : 0"+this.d+"  Win" );}
		else{fichier.println("Vampire : "+this.b+"  Win" );}
		fichier.close();
		}
		catch(Exception e) {}
	}
	
	public void takeVariable()
	{
		String stat=null;
		BufferedReader br;
		int i=0;
		try {
			br = new BufferedReader(new FileReader("stat.txt"));
			String line;
			line = br.readLine();
			VL = 10+Integer.parseInt(line);
			while ((line = br.readLine()) != null) 
			{
				stat=line.substring(10,VL);
				if (i==0){a = Integer.parseInt(stat);}
				if (i==1){b = Integer.parseInt(stat);}
				if (i==2){c = Integer.parseInt(stat);}
				if (i==3){d = Integer.parseInt(stat);}
				i++;			
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print()
	{
		System.out.println("Fighter : "+a+" Win");
		System.out.println("Healer : "+b+" Win");
		System.out.println("Tank : "+c+" Win");
		System.out.println("Vampire : "+d+" Win");
	}
}



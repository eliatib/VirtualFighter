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
		if(this.a>9||this.b>9||this.c>9||this.d>9)
		{
			VL=2;
		}
		PrintWriter fichier = new PrintWriter(new FileWriter("stat.txt" ), false);
		fichier.println(VL-10);
		fichier.println("Fighter : "+this.a+"  Win" );
		fichier.println("Healer  : "+this.b+"  Win" );
		fichier.println("Tank    : "+this.c+"  Win" );
		fichier.println("Vampire : "+this.d+"  Win" );
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



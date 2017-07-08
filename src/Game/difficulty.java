package Game;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import Model.entity;
import Model.fighter;
import Model.healer;
import Model.tank;
import Model.vampire;
import View.windowElements;
import Game.stat;

public class difficulty {
	
	private int Life,Dmg,LifeAI,DmgAI,FLife,FLifeAI,id_entity,id_AI,Action_AI;
	ArrayList<entity> entities = new ArrayList<entity>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	menuUsed MU = new menuUsed();
	stat stat = new stat();
		
	public void special(int id,int idE,int Action,int ActionE,boolean AI)
	{
		if (id==1 && ActionE==1)
		{
			if(AI==true){Life=Life-Dmg;}
			else{LifeAI=LifeAI-DmgAI;}
			System.out.println("Special: Dmg reverberate");
		}
		
		if (id==2)
		{
			if(AI==true) 
			{
				LifeAI=LifeAI+2;
				if (LifeAI>FLifeAI){LifeAI=FLifeAI;}
			}
			else
			{
				Life=Life+2;
				if (Life>FLife){Life=FLife;}
			}
			System.out.println("Special: Heal(Life +2)");
		}
		
		if (id==3)
		{
			if(AI==true)
			{
			LifeAI=LifeAI-1;
			Life=Life-DmgAI-1;
			}
			else
			{
			LifeAI=LifeAI-Dmg-1;
			Life=Life-1;
			}
			
			System.out.println("Special: PowerBlow(Dmg+1,Life-1)");
			if (ActionE==2)
			{
				System.out.println("protection : ON");
				if(AI==false)
				{
				System.out.println("You hurt yourself");
				LifeAI=LifeAI+Dmg+1;
				}
				else
				{
				System.out.println("ennemy hurt itself");
				Life=Life+DmgAI+1;
				}
			}
			
			if (ActionE==3 && idE==1)
			{
				if(AI==true)
				{
					LifeAI=LifeAI-DmgAI-1;
				}
				else
				{
					Life=Life-Dmg-1;
				}
			}
		}
			
		if (id==4)
		{
			if(AI==true)
			{
				LifeAI=LifeAI+1;
				Life=Life-1;
				if(LifeAI>FLifeAI){LifeAI=FLifeAI;}
			}
			else
			{
				LifeAI=LifeAI-1;
				Life=Life+1;
				if(Life>FLife){Life=FLife;}
			}
			System.out.println("Special: Vampirism(Dmg-1,Life+1)");
			
			if (ActionE==2)
			{
				if(AI==true)
				{
				LifeAI=LifeAI-1;
				Life=Life+1;
				}
				else
				{
				LifeAI=LifeAI+1;
				Life=Life-1;
				}
				System.out.println("protection : ON");
				System.out.println("Noting Happen");
			}
			
			if (ActionE==3 && idE==1)
			{
				if(AI==true)
				{
				LifeAI=LifeAI-1;
				}
				else
				{
				Life=Life-1;
				}
			}
		}
	}
	
	public void go(int Action,int Action_AI,int id_entity,int id_AI)
	{
		boolean AI;
		if (Action_AI==2)
		{
			System.out.println("AI protect itself");
		}
		if (Action==2)
		{
			System.out.println("You're protect yourself");
		}
		if (Action==1)
		{
			System.out.println("You Attack");
			if (Action_AI==2)
			{
				System.out.println("But the AI protect itself");
				LifeAI=LifeAI+1-Dmg;
			}
			else{LifeAI=LifeAI-Dmg;}
		}
		if (Action==3)
		{
			AI=false;
			special(id_entity,id_AI,Action,Action_AI,AI);
		}
		if (Action_AI==1)
		{
			System.out.println("AI attack");
			if (Action==2)
			{
				Life=Life+1-DmgAI;
				System.out.println("But you're protecting yourself");
			}
			else{Life=Life-DmgAI;}
		}
		if (Action_AI==3)
		{
			AI=true;
			special(id_AI,id_entity,Action_AI,Action,AI);
		}
		System.out.println("Your Life: "+Life);
		System.out.println("AI Life: "+LifeAI);
	}
	
	public void Alea(int Action,int Action_AI,int id_entity,int id_AI)
	{
		Action_AI=1;
		Random r = new Random();
		Action_AI=1+r.nextInt(4-1);
		this.Action_AI=Action_AI;
		go(Action,Action_AI,id_entity,id_AI);
	}
	
	public void Normal(int Action,int Action_AI,int id_entity,int id_AI)
	{
		Action_AI=1;
		Random r = new Random();
		if (Action==1){Action_AI=2+r.nextInt(4-2);}
		if (Action==3){Action_AI=3;}
		this.Action_AI=Action_AI;
		go(Action,Action_AI,id_entity,id_AI);
	}
	
	public void Hard(int Action,int Action_AI,int id_entity,int id_AI)
	{
		Action_AI=1;
		if (Action==1)
		{
			if (id_entity==1 || id_entity==4)
			{
				Action_AI=3;
			}
			else {Action_AI=2;}
		}
		if (Action==2)
		{
			if (id_AI==2)
			{
				Action_AI=3;
			}
			else {Action_AI=1;}
		}
		if (Action==3)
		{
			if (id_entity==1 || id_entity==3 || id_entity==4)
			{
				Action_AI=2;
			}
		}
		this.Action_AI=Action_AI;
		go(Action,Action_AI,id_entity,id_AI);
	}
	
	public void Fight(int Difficulty,int Action,int Action_AI,ArrayList<entity> entities)
	{
				setEntity(entities);
				if (Difficulty==1)
				{
					Alea(Action,Action_AI,id_entity,id_AI);
				}
				if (Difficulty==2)
				{
					Normal(Action,Action_AI,id_entity,id_AI);
				}
				if (Difficulty==3)
				{
					Hard(Action,Action_AI,id_entity,id_AI);
				}
				if(LifeAI<=0&&Life>0)
				{
					stat.takeVariable();
					int a=0,b=0,c=0,d=0;
					if (id_entity==1){a++;}
					if (id_entity==2){b++;}
					if (id_entity==3){c++;}
					if (id_entity==4){d++;}
					stat.write(a, b, c, d);
					int Result=1;
					MU.menuRetry(Result);
				}
				if(Life<=0&&LifeAI>0)
				{
					stat.takeVariable();
					int a=0,b=0,c=0,d=0;
					if (id_AI==1){a++;}
					if (id_AI==2){b++;}
					if (id_AI==3){c++;}
					if (id_AI==4){d++;}
					stat.write(a, b, c, d);
					int Result=2;
					MU.menuRetry(Result);
				}
				if(Life<=0&&LifeAI<=0)
				{
					stat.takeVariable();
					int a=0,b=0,c=0,d=0;
					if (id_AI==1||id_entity==1){a++;}
					if (id_AI==2||id_entity==2){b++;}
					if (id_AI==3||id_entity==3){c++;}
					if (id_AI==4||id_entity==4){d++;}
					stat.write(a, b, c, d);
					int Result=3;
					MU.menuRetry(Result);
				}
				else
				{
				entities.clear();
				Reset(entities);
				}
			}
		


	
	public int getAction_AI() {
		return Action_AI;
	}

	public void setEntity(ArrayList<entity> entities)
	{
		for(int i=0;i<entities.size();i++)
		{
			entity TempEntity = entities.get(i);
			if(i==0)
			{
				id_entity = TempEntity.getId();
				Life = TempEntity.getLife();
				FLife = TempEntity.getFLife();
				Dmg = TempEntity.getDmg();
			}
			else
			{
				id_AI = TempEntity.getId();
				LifeAI = TempEntity.getLife();
				FLifeAI = TempEntity.getFLife();
				DmgAI = TempEntity.getDmg();
			}
		}
	}
	
	public void Reset(ArrayList<entity> entities)
	{
		if (id_entity==1)
		{
			entities.add(new fighter(100,900/2-84,1,Life,3,2));
		}
		if (id_entity==2)
		{
			entities.add(new healer(100,900/2-88,2,Life,4,1));
		}
		if (id_entity==3)
		{
			entities.add(new tank(100,900/2-45,3,Life,5,1));
		}
		if (id_entity==4)
		{
			entities.add(new vampire(100,900/2-84,4,Life,4,2));
		}
		if (id_AI==1)
		{
			entities.add(new fighter(635,900/2-84,1,LifeAI,3,2));
		}
		if (id_AI==2)
		{
			entities.add(new healer(635,900/2-88,2,LifeAI,4,1));
		}
		if (id_AI==3)
		{
			entities.add(new tank(635,900/2-45,3,LifeAI,5,1));
		}
		if (id_AI==4)
		{
			entities.add(new vampire(635,900/2-84,4,LifeAI,4,2));
		}
	}
}

package Game;

import java.util.ArrayList;
import java.util.Random;

import Model.entity;
import Model.fighter;
import Model.healer;
import Model.tank;
import Model.vampire;

public class difficulty {
	
	private int Life,Dmg,LifeAI,DmgAI,FLife,FLifeAI,id_entity,id_AI;
	ArrayList<entity> entities = new ArrayList<entity>();
		
	public void special(int id,int Action,int ActionE,boolean AI)
	{
		if (id==1 && Action==1)
		{
			if(AI==true){Life=Life-DmgAI;}
			else{LifeAI=LifeAI-Dmg;}
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
			LifeAI=LifeAI-1;
			Life=Life-1;
			System.out.println("Special: PowerBlow(Dmg+1,Life-1)");
			if (ActionE==2)
			{
				System.out.println("protection : ON");
				if(AI==false)
				{
				System.out.println("You hurt yourself");
				LifeAI=LifeAI+1;
				}
				else
				{
				System.out.println("ennemy hurt itself");
				Life=Life+1;
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
		}
	}
	
	public void go(int Action,int Action_AI,int id_entity,int id_AI)
	{
		boolean AI;
		if (Action_AI==2)
		{
			System.out.println("AI protects itself");
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
				System.out.println("But the AI protects itself");
				LifeAI=LifeAI+1-Dmg;
			}
			else{LifeAI=LifeAI-Dmg;}
		}
		if (Action==3)
		{
			AI=false;
			special(id_entity,Action,Action_AI,AI);
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
			special(id_AI,Action_AI,Action,AI);
		}
		System.out.println("Your Life: "+Life);
		System.out.println("AI Life: "+LifeAI);
	}
	
	public void Alea(int Action,int id_entity,int id_AI)
	{
		Random r = new Random();
		int Action_AI=1+r.nextInt(4-1);
		go(Action,Action_AI,id_entity,id_AI);
	}
	
	public void Normal(int Action,int id_entity,int id_AI)
	{
		
	}
	
	public void Hard(int Action,int id_entity,int id_AI)
	{
		
	}
	
	public void Fight(int Difficulty,int Action,ArrayList<entity> entities)
	{
		setEntity(entities);
		if (Difficulty==1)
		{
			Alea(Action,id_entity,id_AI);
		}
		if (Difficulty==2)
		{
			Normal(Action,id_entity,id_AI);
		}
		if (Difficulty==3)
		{
			Hard(Action,id_entity,id_AI);
		}
		entities.clear();
		Reset(entities);
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

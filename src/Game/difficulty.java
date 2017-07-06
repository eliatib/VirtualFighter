package Game;

import java.util.ArrayList;
import java.util.Random;

import Model.entity;

public class difficulty {
	
	private int Life,Dmg,LifeAI,DmgAI,FLife,FLifeAI,id_entity,id_AI;
	ArrayList<entity> entities = new ArrayList<entity>();
	
	public void setFLife(int id_entity, int id_AI) 
	{
		System.out.println(id_entity);
		if(id_entity==1)
		{
			FLife=3;
		}
		if(id_entity==2)
		{
			FLife=4;
		}
		if(id_entity==3)
		{
			FLife=5;
		}
		if(id_entity==4)
		{
			FLife=4;
		}
		if(id_AI==1)
		{
			FLifeAI=3;
		}
		if(id_AI==2)
		{
			FLifeAI=4;
		}
		if(id_AI==3)
		{
			FLifeAI=5;
		}
		if(id_AI==4)
		{
			FLifeAI=4;
		}
		System.out.println(Life);
	}

	
	public void special(int id,int Action,int ActionE,int Life,int LifeE,int FLife,int DmgE,boolean AI)
	{
		System.out.println(id);
		if (id==1 && Action==1)
		{
			LifeE=LifeE-DmgE;
			System.out.println("Special: Dmg reverberate");
		}
		if (id==2)
		{
			Life=Life+2;
			if (Life>FLife){Life=FLife;}
			System.out.println("Special: Heal(Heal 2)");
		}
		if (id==3)
		{
			LifeE=LifeE-1;
			System.out.println("Special: PowerBlow(Dmg+1,Life-1)");
			if (ActionE==2)
			{
				LifeE=LifeE+1;
				System.out.println("protection : ON");
				System.out.println("Noting Happen");
			}
		}
		if (id==3)
		{
			LifeE=LifeE+1;
			Life=Life+1;
			System.out.println("Special: Vampirism(Dmg-1,Life+1)");
			if (ActionE==2)
			{
				LifeE=LifeE+1;
				Life=Life-1;
				System.out.println("protection : ON");
				System.out.println("Noting Happen");
			}
			if (AI==true)
			{
				LifeAI=Life;
			}
			else 
			{
				this.Life=Life;
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
			special(id_entity,Action_AI,Action,Life,LifeAI,FLife,DmgAI,AI);
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
			special(id_AI,Action,Action_AI,LifeAI,Life,FLifeAI,Dmg,AI);
		}
		System.out.println("Your Life: "+Life);
		System.out.println("AI Life: "+LifeAI);
	}
	
	public void Alea(int Action,int id_entity,int id_AI)
	{
		System.out.println(id_entity);
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
		setFLife(id_entity,id_AI);
		System.out.println(id_entity);
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
				Dmg = TempEntity.getDmg();
			}
			else
			{
				id_AI = TempEntity.getId();
				LifeAI = TempEntity.getLife();
				DmgAI = TempEntity.getDmg();
			}
		}
	}
	
	public void Reset(ArrayList<entity> entities)
	{
		if (id_entity==1)
		{
			
		}
	}
}

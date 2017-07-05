package Game;

public class difficulty {

	public void Fight(int Difficulty,int Action,int id_entity,int id_IA)
	{
		if (Difficulty==1)
		{
			Alea(Action,id_entity,id_IA);
		}
		if (Difficulty==2)
		{
			Normal(Action,id_entity,id_IA);
		}
		if (Difficulty==3)
		{
			Hard(Action,id_entity,id_IA);
		}
	}
	
	public void Alea(int Action,int id_entity,int id_IA)
	{
		
	}
	
	public void Normal(int Action,int id_entity,int id_IA)
	{
		
	}
	
	public void Hard(int Action,int id_entity,int id_IA)
	{
		
	}
}

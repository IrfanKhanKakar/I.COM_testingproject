package Construction;

public class Gove_Construction extends Building_Construction{

private Building_Construction bcon;
	
	public Building_Construction getBcon(){
		return bcon;
	}
	public void setBcon(Building_Construction bcon){
		this.bcon = bcon;
	}
	
	
	
	String Gove_dept;
	
	Gove_Construction(String dept_name, String Bcontruct_num, String Bproduct ,int Bemp_num )
	{
		super(Bcontruct_num,Bproduct,Bemp_num);
		this.Gove_dept=dept_name;
	}

	public void Get_Gove_Contract(){
		
	}
	
	
	
}

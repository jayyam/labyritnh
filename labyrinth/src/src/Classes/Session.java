package src.Classes;

public class Session 

{
	private boolean logged;
	
	private User user= new User();//declarando e inicializando el metodo
	
	public void main(String[] args) 
	
	{
		logged = false;
	}
	
	public boolean isLogged() 
	
	{
		return logged;	
	}
	
	public User getUser() 
	
	{
		return user;
	}
	
}

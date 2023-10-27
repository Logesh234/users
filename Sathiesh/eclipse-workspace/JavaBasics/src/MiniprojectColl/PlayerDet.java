package MiniprojectColl;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerDet {
	static Scanner sc=new Scanner(System.in);
	ArrayList<Player> playerList=new ArrayList<Player>();
	
	PlayerDet(){	
		playerList.add(new Player(45,"Rohit Shrama",  "Mumbai",18000));
		playerList.add(new Player(77,"Shubman Gill",  "Punjab",10000));
		playerList.add(new Player(18,"Virat Kholi ",  "Delhi",24789));
		playerList.add(new Player(96,"Shreyas Iyer",  "Mumbai",3000));
		playerList.add(new Player(1,"K.L.Rahul    ",  "Bangalore",10000));
		playerList.add(new Player(33,"Hardik Pandaya","Gujarat",12000));
		playerList.add(new Player(8,"R.Jadeja       ","Gujarat",6000));
		playerList.add(new Player(99,"R.Ashwin      ","Chennai",3000));
		playerList.add(new Player(23,"Kuldeep Yadav ","Uttar Pradesh",2500));
		playerList.add(new Player(73,"Mohammad Siraj","Hyderabad",2000));
		playerList.add(new Player(93,"Jasprit Bumrah","Gujarat",1879));
		
	}
	public void playersDetials()
	{   		
		System.out.println("==================================================================================================");

		if(playerList.size()==0)
		{
			System.out.println("No record found!!");
		}
		
		
		for(Player s:playerList)
		{
			
				System.out.println("playerJerseyno:"+s.getPlayerJersyno()+"\t playerName:"+s.getPlayerName()+"\t playerNative:"+s.getPlayerNative()+"\t playerTotalruns:"+s.getPlayerTotalruns());
			
		}
		System.out.println("==================================================================================================");

	}
	public void addPlayersInfo() 
	{
		System.out.println("Enter playerJersyno: ");
		int playerjersyno=sc.nextInt();
		System.out.println("Enter PlayerName: ");
		String playerName=sc.next();
		System.out.println("Enter playerNative: ");
		String playerNative=sc.next();
		System.out.println("Enter playerTotalruns: ");
		int playerTotalruns=sc.nextInt();
		
		Player s=new Player(playerjersyno,playerName,playerNative,playerTotalruns);
		
		playerList.add(s);
	}
	
	
	
	public void removeAllinfo()
	{
		System.out.println("==================================================================================================");

		if(playerList.size()>0)
		{
			playerList.clear();
			System.out.println("All records deleted successfully!!");
		}
		else
		{
			System.out.println("No record available!!");
		}
		System.out.println("==================================================================================================");

	}
	public void deleteplayerjeryno() 
	{
		System.out.println("Enter playerJersyno :");
		int playerJersyno=sc.nextInt();//101
		int index=0,flag=0;
		Player s=null;
		
		for(Player player:playerList)
		{
			if(playerJersyno==player.getPlayerJersyno())//101
			{
				flag=1;
				index=playerList.indexOf(player);
				s=player;
				System.out.println(index);
				System.out.println(player);
				break;
			}
		}
		System.out.println("==================================================================================================");

		if(flag==0)
		{
			System.out.println("Player Id does not exist!!");
		}
		else
		{
			playerList.remove(s);
			System.out.println("Player record deleted successfully!!");
		}
		
		System.out.println("==================================================================================================");

	}
}

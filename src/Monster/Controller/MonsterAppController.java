package Monster.Controller;

import Monster.view.MonsterView;
import Monsters.Model.MarshmallowMonster;

public class MonsterAppController
{
	private MonsterView appview;
	private MarshmallowMonster myMonster;
	
	public MonsterAppController()
	{
		appview = new MonsterView(this);
		myMonster = new MarshmallowMonster("Appleman", 10, 4, 2, 2, 0, true);
	}

	public void start()
	{
		appview.displayinformation();
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}

}

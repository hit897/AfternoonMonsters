package Monster.view;

import javax.swing.JOptionPane;

import Monster.Controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;	
	}
	
	public void displayinformation()
	{
		JOptionPane.showMessageDialog(null, "Wow a popup!!");
		JOptionPane.showMessageDialog(null, "I made a monster, it's name is " + baseController.getMyMonster().getname());
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getname() + " has " + baseController.getMyMonster().getArmCount() + " arms");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getname() + " has " + baseController.getMyMonster().getNumberOfLegs() + " legs");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getname() + " has " + baseController.getMyMonster().getAmountOfHair() + " hairs");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getname() + " has " + baseController.getMyMonster().getEyeCount() + " eyes");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getname() + " has " + baseController.getMyMonster().getNoseCount() + " noses");
		JOptionPane.showMessageDialog(null, "It's "  + baseController.getMyMonster().hasBellyButton() + "...that " + baseController.getMyMonster().getname() + " has a Belly Button!");
	}

}

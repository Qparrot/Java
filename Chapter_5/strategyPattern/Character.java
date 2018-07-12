import com.pq.behavior.*;
import java.util.*;

public abstract class Character
{
	protected Movement movement = new Running();
	protected WarSpirit warspirit = new Fightful();

	public Character()
	{
	}

	public Character( Movement movement, WarSpirit warspirit)
	{
		this.movement = movement;
		this.warspirit = warspirit;
	}

	public void toMove()
	{
		movement.toMove();
	}

	public void fight()
	{
		warspirit.fight();
	}

	public void setFight(Movement movement)
	{
		this.movement = movement;
	}
	
	public void setToMove(WarSpirit warspirit)
	{
		this.warspirit = warspirit;
	}
}

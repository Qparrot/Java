import java.util.*;
import com.pq.behavior.*;

public class Scout extends Character
{
	public Scout()
	{
		this.warspirit = new Fightful();
		this.movement = new Running();
	}
}

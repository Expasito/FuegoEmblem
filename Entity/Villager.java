package Entity;

public class Villager extends Entity {
	public Villager(int x, int y) {
		this.x=x;
		this.y=y;
		this.name="Villager";
		this.mvt=9;
		this.inf=true;
		this.fly=false;
	}

}

public class GameCharacter {
	private String name;
	protected int hp;
	protected int damage;
        protected int maxHp;

	public GameCharacter(String name){
		this.name = name;
		hp = 0;
		damage = 0;
		maxHp = 0;
	}

	public String getName(){
		return name;
	}

	public boolean Dead(){
		if(hp == 0)
			return true;
		return false;
	}

	public int getHP(){
		return hp;
	}
	public int getDamage(){
		return damage;
	}
        
	public int getMaxHP(){
		return maxHp;
	}

	public void Damage(int hp){
		this.hp -= hp;
		if(this.hp < 0)
			this.hp = 0;
	}	

	public void attack(GameCharacter Enemy){
		Enemy.Damage(damage);
	}

	public void print(){
		System.out.println("Name: " + name);
		System.out.println("HP: " + hp);
	}
}

public class Monster extends GameCharacter {
        protected int exp;
        protected int coin;
	public Monster(String name, int hp, int damage , int exp , int coin) {
		super(name);
		this.hp = hp;
		this.damage = damage;
                this.exp = exp;
                this.coin = coin;
	}

	public void print(){
		System.out.print("Monster ");
		super.print();
	}
        public int getExp(){
                return this.exp;
        }
        public int getCoin(){
                return this.coin;
        }
 
}

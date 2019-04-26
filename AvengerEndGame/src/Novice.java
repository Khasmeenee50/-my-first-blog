
import javax.swing.JTextField;

public class Novice extends GameCharacter {
	private int exp;
	private int level;
        private int coin;
        private int count;
	private final int maxLevel=10;
	private final int[] levelUpp = {0,100,200,300,400,500,600,700,800,900};
	private Bag bag;

	public Novice(String name){
		super(name);

		exp = 0;
		level = 1;
                count = 0;
                coin = 0;
		hp = 100;
		damage = 5;
		maxHp = 100;
		bag = new Bag();
	}


	public int getExp(){
		return exp;
	}
        public int getCoin(){
		return coin;
	}
        public int getCount(){
		return count;
	}
	
	public int getLevel(){
		return level;
	}


        @Override
	public int getMaxHP(){
		return maxHp;
	}
        public void LevelUp(){
            for(int i = 9;i > 0;--i){
                if(exp >= levelUpp[i]){
                    level = i+1;
                    this.damage+=2;
                    this.coin+=50;
                }
            }
        }
        
        public void CountUp(){
		this.count +=1;
	}
        public void CoinUp(int coin){
		this.coin +=coin;
	}
        public void CoinDown(int coin){
		this.coin -=coin;
	}
	public boolean keepItem(Item item){
                return bag.addItem(item);
                //System.out.println("Add ITEM: "+bag.addItem(item));
	}
         public void ExpUp(int exp){
		this.exp += exp;
		LevelUp();
	}

        @Override
	public void print(){
		super.print();
		System.out.println("Level: " + level);
                System.out.println("Damage: " + damage);
		System.out.println("Exp: " + exp);
                System.out.println("Coin: " + coin);
		
	}



}


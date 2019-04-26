public class Item extends Shop{
	
    public Item(String name,int hp , int coin){
                super(name);
                this.hp = hp;
                this.coin = coin;
	}
        public int getHp(){
            return this.hp;
        }
        public int getCoin(){
            return this.coin;
        }
        
}

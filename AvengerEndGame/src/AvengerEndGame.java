import java.util.Scanner;
public class AvengerEndGame {
        private Scanner sc;
	private boolean running;
	private Novice player;
        //private Bag bag;
        public static void main(String args[]){
                AvengerEndGame Avenger = new AvengerEndGame();
                Avenger.run();
        }
	public AvengerEndGame(){
		sc = new Scanner(System.in);
                running = false;
	}

	public void run(){
		running = true;
		printStart();
		createPlayer();
		player.print();

		if(sc.hasNextLine()){
			sc.nextLine();
		}
	
		while(running){
			System.out.println();
                        System.out.println("Command");
                        System.out.println("My Status");
                        System.out.println("Attack Monster");
                        System.out.println("Shop");
                        System.out.println("Bag");
                        System.out.println("Quit");
			System.out.print("Enter command: ");

			String cmd = sc.nextLine();

			if(cmd.equals("Quit")){
                                printEndGame();
				running = false;
				continue;
			}
			else if(cmd.equals("Shop")){
				Shopping();
			}
                        else if(cmd.equals("Bag")){
                                Bag bag = new Bag();
				bag.printBag();
			}
			else if(cmd.equals("Attack Monster")){
				StatusMonster();
			}
			else if(cmd.equals("My Status")){
				player.print();
			}
			else {
				System.out.println("Command " + cmd + " is not impremented");
			}
		}
		printEndGame();
	}

	private void Shopping(){
                Item[] items = {
                    new Item("Apple", 5,100),
                    new Item("Autumn Red Tea", 15, 500),
                    new Item("Coconut", 25,1000)
                };
		System.out.println();
		System.out.println("Items");
                for(int i=0; i<items.length; ++i){
			System.out.println("" + (i+1) + ": " + items[i].getName() +
					" HP: " + items[i].getHp() +
					" Coin: " + items[i].getCoin());
		}	
		System.out.print("Select one item: ");
		int index = sc.nextInt();
		while(index <= 0 || index > 3){
			System.out.print("Index out of range reselect again: ");
			index = sc.nextInt();
		}
                System.out.println("Player Coin: "+player.getCoin());
                System.out.println("item Coin: "+items[index-1].getCoin());
                if(player.getCoin() >= items[index-1].getCoin()){
                    player.keepItem(items[index-1]);
                    player.CoinDown(items[index-1].getCoin());
                    System.out.println("Buy SUCCESS!");
                }
                else{
                    System.out.println("Not enough coins.");
                }
		sc.nextLine();
	}

	private void StatusMonster(){
		Monster[] monsters = {
			new Monster("Ultron", 10, 1 , 50 , 50),
			new Monster("Red Skull", 50 , 10, 80 , 150),
			new Monster("Thanos", 100, 20 , 100 , 300)
		};

		System.out.println("Monster around you");
		int selected = -1;
		for(int i=0; i<monsters.length; ++i){
			System.out.println("" + (i+1) + ": " + monsters[i].getName() +
					" HP: " + monsters[i].getHP() +
					" Damage: " + monsters[i].getDamage());
                        System.out.println(" Taking ");
                        System.out.println(" exp: " + monsters[i].getExp() +
                        " "+ " Coin: " + monsters[i].getCoin());
		}

		while(selected < 1 || selected > monsters.length){
			System.out.print("Which monster: ");
			selected = sc.nextInt();
		}

		Monster monster = monsters[selected-1];

		while((!player.Dead()) && (!monster.Dead())){
			player.attack(monster);
			if(!monster.Dead())
				monster.attack(player);
			else{
                                player.CountUp();
				System.out.println("Monster " + monster.getName() + " die .");
                                System.out.println("Taking Exp+" + monster.getExp() + " Coin+" + monster.getCoin());
                                player.ExpUp(monster.getExp());
                                player.CoinUp(monster.getCoin());
				break;
			}
			System.out.println("Your HP: " + player.getHP());
			System.out.println("Monster " + monster.getName() + " HP: " + monster.getHP());
			if(player.getHP()==0){
                            System.out.println("You are dead . . .");
                            System.out.println("Game Over !!!");
                            printEndGame();
                            running = false;
                            break;
                        }
			System.out.print("Attack again (y/n): ");
			char continued = sc.next().charAt(0);
			if(continued != 'y')
				break;
		}
		sc.nextLine();

	}

	private void createPlayer(){

		System.out.print("Enter character name: ");
		String name = sc.next();
		player = new Novice(name);
	}


	private void printStart(){
		System.out.println("====== Welcome to Avenger : End Game ======");
	}

	private void printEndGame(){
		System.out.println();
		System.out.println("=============== End Game ===============");
	}

 

}

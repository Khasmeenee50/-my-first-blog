
class SubBag extends Bag {
    public void PrintItem(int number){
        if(number==1){
            System.out.println("Chicken: Hp+0.5");
        }else if(number==2){
            System.out.println("Hit: Exp+1 Hp-1");
        }else if(number==3){
            System.out.println("Stomp: Exp+4 Hp-2");
        }
        
    }
}


class Subnovice extends Novice {
    public void SetCareer(String s){
        career=s;
        if(career=="Swordsman"){
            Spd = 2;
            Atk = 35;
            Def = 60;
        }else if(career=="Archer"){
            Spd = 5;
            Atk = 70;
            Def = 30;
        }
    }
    public void PrintStatusCareer(){
        System.out.println("Your Career : "+career);
        System.out.println("Speed = "+Spd+" Attack = "+Atk+" Defend = "+Def);
    }
}

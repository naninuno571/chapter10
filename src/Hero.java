public class Hero {
    String name="ミナト";
    int hp=100;
    public void attack(Matango m){
        System.out.println(this.name+"攻撃");
        m.hp-=5;
        System.out.println("5ポイントのダメージを与えた");
    }
    public final void slip(){
        this.hp-=5;
        System.out.println(this.name+"は、転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run(){
        System.out.println(this.name+"は、逃げ出した！");
    }
}


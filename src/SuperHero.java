public class SuperHero extends Hero {//継承
    boolean flying;
    public SuperHero() {

    }
    public void fly(){
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }

    @Override
    public void run() {
        System.out.println(this.name + "は撤退した");
    }
    public void attack(Matango m){
        super.attack(m);
        if(this.flying){
            super.attack(m);
        }
    }
    /*public void slip(){finalで宣言されているメソッドはオーバーライドできない
        this.hp-=999
        System.out.println(this.name+"は、転んだ！");
        System.out.println("5のダメージ！");
    }*/

}

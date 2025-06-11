//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        SuperHero sh = new SuperHero();
        sh.fly();//SuperHeroクラスに書いた処理
        sh.run();
        Hero h = new Hero();
        h.run();
    }
}
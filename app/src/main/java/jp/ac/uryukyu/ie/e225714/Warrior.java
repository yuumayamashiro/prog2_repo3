package jp.ac.uryukyu.ie.e225714;

public class Warrior extends LivingThing {
    public Warrior(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

   
    public void attackWithWeponSkill(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)( attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}

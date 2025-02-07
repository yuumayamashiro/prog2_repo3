package jp.ac.uryukyu.ie.e225714;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    // コンストラクタ
    public Enemy(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    @Override
    public void wounded(int damage) {
        hitPoint -= damage; // クラスの `hitPoint` を直接変更
        if (hitPoint <= 0) {
            hitPoint = 0; // HPが負の値にならないように
            dead = true;  // `dead` フィールドを正しく更新
            System.out.printf("モンスター %s は倒れた。\n", getName());
        }
    }
}


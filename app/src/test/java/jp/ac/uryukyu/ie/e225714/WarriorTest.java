package jp.ac.uryukyu.ie.e225714;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WarriorTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
void attackTest() {
    int defaultWarriorHp = 100;
    int initialEnemyHp = 100; // スライムの初期HP
    Warrior demoHero = new Warrior("デモウォリアー", defaultWarriorHp, 10);
    Enemy slime = new Enemy("スライムもどき", initialEnemyHp, 0);
    
    // 3回攻撃する（ダメージが150%であることを確認）
    for (int count = 0; count < 3; count++) {
        demoHero.attackWithWeponSkill(slime); // 3回攻撃
        
    }
    
    // もし攻撃が150%ダメージだとすると、スライムのHPは
    // initialEnemyHp * 1.5 * 3 回のダメージで減少する
    int expectedSlimeHp = initialEnemyHp - (int) (10 * 1.5 * 3);

    // 最後にスライムが攻撃してくる
    slime.attack(demoHero);

    // demoHeroのHPが初期HPと等しいかどうかを確認
    assertEquals(defaultWarriorHp, demoHero.getHitPoint());

    // スライムのHPが期待されるHPになっているか確認
    
    assertEquals(expectedSlimeHp, slime.getHitPoint());

}


}

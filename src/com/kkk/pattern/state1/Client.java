package com.kkk.pattern.state1;

/**
 * Created by z3jjlzt on 2018/2/25.
 */
public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.hurt(300);
        player.hurt(201);
        player.heal(200);
        player.heal(200);
        player.hurt(1200);
    }
}

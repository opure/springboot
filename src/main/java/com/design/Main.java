package com.design;

/**
 * Created by USER on 2016/8/19.
 */
public class Main {
    public static void main(String[] args) {
        Solider s = new Solider();
        s.setAbstrackGun(new Ak());
        s.kill();
    }
}


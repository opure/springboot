package com.design;

/**
 * Created by USER on 2016/8/19.
 */
public class Solider {
    private AbstrackGun abstrackGun;

    public void setAbstrackGun(AbstrackGun abstrackGun) {
        this.abstrackGun = abstrackGun;
    }

    public void kill() {
        System.out.println("kaishi");
        abstrackGun.shoot();

    }
}

package com.factory;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        System.out.println("-------产生白种人-----------:");
        WhiteHuman whiteHuman = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("-------产生黄种人------------:");
        YellowHuman yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        System.out.println("--------产生黑种人------------：");
        BlackHuman blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}

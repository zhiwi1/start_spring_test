package org.zhyuliuk.springapp;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("do class mus init");
    }

    public void destroy() {
        System.out.println("do class mus destroy");
    }

    @Override
    public String getSong() {
        return "rapsody";
    }

}

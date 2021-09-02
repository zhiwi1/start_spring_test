package org.zhyuliuk.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music testBean = context.getBean("musicBean", Music.class);
//        System.out.println(testBean.getSong());
//        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(mp.getName());
//        System.out.println(mp.getVolume());
//        mp.playMusic();
        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
        ClassicalMusic cm2=context.getBean("musicBean1",ClassicalMusic.class);
        System.out.println( classicalMusic.getSong());
        context.close();
    }
}

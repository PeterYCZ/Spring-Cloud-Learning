package com.jky.monitor;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Mythread extends Thread {

    @Override
    @Scheduled(cron = "0/20 * * * * ?")
    public void run(){
        try {
            System.out.println("start");
            this.sleep(20000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

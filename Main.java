package com.company;
import  java.lang.Thread.*;

import static java.lang.Thread.sleep;


public class Main {

    public static void main(String[] args) throws Exception {
        while (true) {
            try {
                sleep(10000);
                System.out.println("time is now->" + java.time.LocalDateTime.now());
            }
            catch(Exception threadInteruptedException)
            {
                //do nothing seriosuly
            }
        }

    }


}

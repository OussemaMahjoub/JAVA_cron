/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cron;

import it.sauronsoftware.cron4j.Scheduler;

/**
 *
 * @author mahjoub
 */
public class Cron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Creates a Scheduler instance.
        Scheduler s = new Scheduler();
        // Schedule a once-a-minute task.

        s.schedule("*/1 * * * *", new Runnable() {
            int i = 0;

            public void run() {

                i++;
                System.out.println("j= " + i);
                
            }
        });

        // Starts the scheduler.
        s.start();

        // Will run for ten minutes.
        /*try {
			Thread.sleep(1000L * 60L * 10L);
                        
		} catch (InterruptedException e) {
			;
		}*/
        // Stops the scheduler.
        // s.stop();
    }
    
}

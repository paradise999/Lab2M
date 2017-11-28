/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2m;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lab-2
 */



class AffableThread extends Thread
{
    
	@Override
	public void run()	//Этот метод будет выполнен в побочном потоке
	{
            Scanner sc = new Scanner(System.in);
         System.out.println("Enter numbers:");
            int a= sc.nextInt();
            int b= sc.nextInt();
            System.out.println("Summa: "+(a+b));
            
        }
}

class AT2 extends Thread
{
    
	@Override
	public void run()	//Этот метод будет выполнен в побочном потоке
	{            
            while(true){
                try { 
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AT2.class.getName()).log(Level.SEVERE, null, ex);
                }
         System.out.println("Я работаю");      
            }
        }
}

public class Lab2M
{
       static AffableThread mSecondThread;
        static AT2 at;
        public static int c = 0;
        public static boolean bc = true;
        
        
	public static void main(String[] args)
	{
            
	mSecondThread = new AffableThread();	//Создание потока
	mSecondThread.start();					//Запуск потока
                at = new AT2();
                at.start();
	System.out.println("Главный поток завершён...");
	}
}



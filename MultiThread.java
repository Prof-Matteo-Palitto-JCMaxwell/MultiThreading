package multithread;
import java.util.concurrent.TimeUnit;
import static multithread.schermi.cont;

public class MultiThread 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread iniziata...");
        long start = System.currentTimeMillis();
        
        schermi monitor = new schermi();
        
        // creazione e partenza threads
        Thread tic = new Thread (new TicTacToe("TIC", monitor));
        tic.start();
        Thread tac = new Thread (new TicTacToe("TAC", monitor));
        tac.start();
        Thread toe = new Thread (new TicTacToe("TOE", monitor));
        toe.start();
            
        //attesa del ciclo di tutti i threads
        try 
        {
            tic.join();
        }     
        catch (InterruptedException e) 
        {}
    
        try 
        {
            tac.join();
        } 
        catch (InterruptedException e) 
        {}
        
        try 
        {
            toe.join();
        } 
        catch (InterruptedException e) 
        {}
        
        System.out.println();
        
        System.out.println("Main THREAD terminata. Punteggio: " + cont);
    
        long end = System.currentTimeMillis();
        System.out.println("Main Thread completata! tempo di esecuzione: " + (end - start) + "ms");
    }
}

class schermi 
{
    String ultimoTHREAD = ""; 
    static int cont = 0;

    public void scrivi(String thread, String msg) 
    {
        int casuale=100+(int)(Math.random()*300);    msg += ": " + casuale;    //numero casuole tra 100 e 300
        
        if( thread.equals("TOE") && ultimoTHREAD.equals("TAC"))    //controllo se TOE capita dopo TAC
        {
            cont++;    
            msg += "  <----------------";      
        }
                try 
        {
            TimeUnit.MILLISECONDS.sleep(casuale);     //attesa tempo random per visualizzare i threads
        }   
        catch (InterruptedException e) 
        {} 
        
        System.out.println(msg);
        ultimoTHREAD = thread;
    }
}

class TicTacToe implements Runnable 
{    
    private String t;
    private String msg;
    schermi monitor;

    public TicTacToe (String s, schermi monitor) 
    {
        this.t = s;
        this.monitor = monitor;
    }
    
    @Override
    public void run() 
    {
        //ciclo vitale dei threads
        for (int i = 10; i > 0; i--) 
        {
            msg = "<" + t + "> " + t + ": " + i;
            monitor.scrivi(t, msg);
        }
    }
}

package br.cefetmg.threadsort;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Guilherme Batista Fernandes Coelho
 */
public class ThreadSort {
    
    public static void main(String[] Args){
        
        try{
            List<List<Integer>> list; 
            List<Thread> lt = new ArrayList<>();
            Reader r = new Reader();
            list = r.reader();
            
            for(var p : list){
                Sort sorter = new Sort(p);
                Thread t = new Thread(sorter);
                lt.add(t);
                t.start();
            }
            
            //jeito baum { 
            //o var se adequa ao tipo do que voce ta iterando
            for (var p : lt) {
                p.join();
            } 
            /// }
     
            

            //jeito caio {
//            boolean isBonito = true;
//            while(isBonito){
//                for(var p : lt){
//                    if(!p.isAlive()){
//                        isBonito = false;
//                    }
//                }
//                Thread.sleep(100);
//            }
            // }    
            
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream("files/dataout.txt"), "UTF-8");
            BufferedWriter writer = new BufferedWriter(write);
            
            for(var l: list){
                for (var i : l) {
                    writer.write(i.toString() + "\n");                    
                }
                writer.write("\n");
            }
            writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

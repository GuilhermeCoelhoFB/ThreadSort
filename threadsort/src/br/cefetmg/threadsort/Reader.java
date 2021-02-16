
package br.cefetmg.threadsort;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reader{
    
    public Reader(){
        
    }
        
    public List<List<Integer>> reader(){
       
        try{
            InputStreamReader read = new InputStreamReader(new FileInputStream("files/data.txt"), "UTF-8");
            BufferedReader reader = new BufferedReader(read);
 
            List<List<Integer>> lista = new ArrayList<>();
            List<Integer> lautal = new ArrayList<>();
            
            lista.add(lautal);
            
            String linha;
            
            while( (linha = reader.readLine()) != null ){
                if(linha.isEmpty()){
                    lautal =  new ArrayList<>();
                    lista.add(lautal);
                    continue;
                }
                lautal.add(Integer.parseInt(linha));
            }
           
            read.close();
            
            return lista;
        }
        
        catch(Exception e){
            throw new RuntimeException(e);            
        }
       
    }
}

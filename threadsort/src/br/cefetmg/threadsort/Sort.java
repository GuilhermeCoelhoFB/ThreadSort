/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.threadsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author caked
 */
public class Sort implements Runnable{
   
    private List<Integer> f; 
    
    public Sort(List<Integer> f){
        this.f = f;
    }
  
    @Override
    public void run(){
        sort();
    }
    
    public void sort(){
                
        Collections.sort(f);
       
    }
    
    
}

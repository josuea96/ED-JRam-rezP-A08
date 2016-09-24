//Josué Alexis Ramírez Pérez A00513622 4º Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddoublelinklist;

/**
 *
 * @author josuealexis96
 */
public class nodeDL<N> {
    //Atributos
    nodeDL next;
    nodeDL prev;
    N data;
    
    public nodeDL (N data){
        this.data = data;
    }
}

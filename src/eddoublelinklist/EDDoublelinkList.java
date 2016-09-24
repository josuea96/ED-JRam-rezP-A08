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
public class EDDoublelinkList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        doubleLnkList Lista = new doubleLnkList();
        Lista.insertFirst("Hola Mundo");
        Lista.insertFirst(29);
        Lista.insertFirst(3.4);
        Lista.insertLast(14);
        Lista.insertLast(4);
        
        System.out.println("");
        Lista.showList();
        System.out.println("");
        Lista.showInvertList();
        System.out.println("");
        Lista.eNode("Hola");
        Lista.showList();
        System.out.println("");
        Lista.eNode("Hola Mundo");
        Lista.showList();
        System.out.println("");
        Lista.showInvertList();
        System.out.println("");
        
        Lista.eNodeFirst();
        Lista.eNodeLast();
        Lista.showList();
        System.out.println("");
        Lista.showInvertList();

        Lista.eList();
        Lista.showList();
        
    }
    
}

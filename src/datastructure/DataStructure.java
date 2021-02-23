/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Vector;

/**
 *
 * @author A7medMustafaHasan95
 */
public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        Vector v = new Vector();
        v.add(s1);
        v.add(s2);
        String s3 = (String)v.elementAt(0) + v.elementAt(1);
        System.out.println(s3);
        // TODO code application logic here
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Thang PC
 */
public class ioc {
    public static boolean ktChar(String s){
        try {
            char c = s.charAt(0);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public static boolean ktInt(String s){
        try {
            char c = s.charAt(0);
            int n = Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public static Object readFile(String s) throws IOException, ClassNotFoundException{
        if(!new File(s).exists()){
            new File(s).createNewFile();
        }
        ObjectInputStream io = new ObjectInputStream(new FileInputStream(s));
        Object a = io.readObject();
        io.close();
        return a;
    }
    public static void writeFile(String s,Object b) throws IOException{
        if(!new File(s).exists()){
            new File(s).createNewFile();
        }
        ObjectOutputStream io = new ObjectOutputStream(new FileOutputStream(s));
        io.writeObject(b);
        io.close();
    }
}

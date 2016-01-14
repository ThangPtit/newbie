/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Thang PC
 */
import java.util.*;
public class bai2_10 {
    public static int C(int n,int k) {
        if(k==0||k==n){
            return 1;
        }
        else
        return (C(n-1,k)+C(n-1,k-1));
    }
    public static void main(String[] args) {
        int k=0;
        Scanner inp= new Scanner(System.in);
        System.out.println("Nhập n= ");
        int n= inp.nextInt();
        while(k<=n){
            System.out.println("C("+n+","+k+") = " +C(n,k));
            k++;
        }
    }
}

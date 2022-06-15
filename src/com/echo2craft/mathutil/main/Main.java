/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo2craft.mathutil.main;

import com.echo2craft.mathutil.core.MathUtility;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        //thu nghiem ham tinh giai thua coi chay dung nhu thiet ke hay ko
        //ta phai dua ra cac tinh huong su dung ham trong thuc te
        //vidu: -5 coi tinh dc ko
        //      0 coi tinh may
        //      20 coi tinh may
        //      21 coi tinh may!!!
        //Test Case: Mot tinh huong ham/app/man hinh/tinh nang dc dua vao su dung
        //gia lap hanh vi xai cua ai do!!!
        
        //TEST CASE: LA 1 TINH HUONG SU DUNG, XAI APP (HAY HAM) MA NO BAO GOM:
        // INPUT: DATA DAU VAO CU THE NAO DO
        // OUTPUT: DAU RA UNG VOI XU LI CUA HAM/CHUC NANG CUA APP, DI NHIEN DUNG DAU
        //VAO DE XU LI
        //KI VONG: MONG HAM SE TRA VE VALUE NAO DO UNG VOI INPUT O TREN
        //SO SANH DE XEM KET QUA CO NHU KI VONG HAY KO
        String expected = "120";// t ki vong ham oi ra 120 neu tinh 5!
        int n = 20;          // input
        long actual = MathUtility.getFactorial(n);
        System.out.println( n + "! = " + expected + " expected");
        System.out.println( n + "! = " + actual + " actual");
    }
}

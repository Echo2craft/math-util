/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo2craft.mathutil.core;

/**
 *
 * @author echo2craft
 */
public class MathUtility {
    //trong clash nay cung cap cho ai do nhieu ham xu li toan hoc
    //clone class Math của JDK
    //ham thu vien xai chung cho ai do, ko can luu lai trang thai/ gia tri
    //chon thiet ke la ham static
    
    //ham tinh giai thua!!!
    //n! = 1.2.3.4...n
    //ko co giai thua cho so am
    // 0! = 1! = 1 quy uoc
    //giai thua ham do thi doc dung, tang nhanh ve gia tri
    // 20 giai thua 18 con so 0, vua kip du cho kieu long cua Java
    //21 giai thua tran kieu ling
    // bai nay quy uoc tinh n! trong khoang tu 0..20
    
    //OLD CODE
//    public static long getFactorial(int n){
//        
//     if(n<0 || n>20)
//         throw new IllegalArgumentException("Invalid Argument, N must be between 0 to 20");
//     if(n== 0 || n == 1) return 1; // ket thuc cuoc choi som neu nhan dau vao dac biet
//     long product = 1; // tich nhan don, thuat toan heo dat, oc bu nhoi thit
//        for (int i = 2; i <=n; i++) product *= i;//product = product * i
//     return product;
//    }
    
    //Hoc de quy trong vong 30s - RECURSION
    //hien tuong goi lai chinh minh voi 1 quy mo khac
    //Vi du: con bup be Nga, giong nhau va long trong nhau
    //bup be to, nho hon, nho hon nua, nho hon nua... den diem dung
    
    //tinh gium tui 6!
    //n! = 1*2*3*4*5*6...*n
    //6! = 6*5!
    //5! = 5*4!
    //...
    //quy uoc 1! = 0! = 1;
    //chot ha: muon tinh n! = n * (n-1)!
    
    //NEW CODE
    public static long getFactorial(int n){
        if(n<0 || n>20)
         throw new IllegalArgumentException("Invalid Argument, N must be between 0 to 20");
        if(n== 0 || n == 1) return 1; // ket thuc cuoc choi som neu nhan dau vao dac biet
        return n * getFactorial(n-1);
    }
}

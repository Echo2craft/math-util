/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo2craft.mathutil.test.core;

import com.echo2craft.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author PC
 */
public class MathUtilityTest {
// đây là class sẽ sử dụng các hàm của thư viện/framework của JUnit
    // để kiểm thử/kt code chính - hàm tínhGiai thừa() bên class core.MathUtils
    //viết code để test code chính bên kia!!!
    //Có nhiều qiu tắc đặt tên hàm kiểm thử
    //nhưng thường nói lên mục đích của các case/ tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại!!!
    
    //hàm dưới đây là tình huống right, return right
    //t sẽ xài hàm kiểu well- đưa 5!,6!, ko đc -5! ...
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa.
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 1;// test case dau tien tu te dau vao, phai chay dung
        long expected = 1; // hy vong rang 0! = 1
        //long actual = ; //goi ham can test ben core/app chinh/code chinh
        long actual = MathUtility.getFactorial(n);
        // so sanh expected vs actual dung xanh xanh do do, framework
        Assert.assertEquals(expected, actual);
        
        // gộp thêm vài case thành công/đưa đầu vào ngon!! hàm phải tính ngon.
        Assert.assertEquals(1, MathUtility.getFactorial(1));
        Assert.assertEquals(2, MathUtility.getFactorial(2));
        Assert.assertEquals(6, MathUtility.getFactorial(3));
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        //ham giup so sanh 2 gia tri nao do co giong nhau hay ko
        //neu giong nhau -> thay mau xanh den duong - duong thong, code ngon
        //                  ít nhất cho case đang test
        // nếu ko giống nhau -> thảy màu đỏ đền đường
        //                      hàm ý expected và actual ko giống nhau
    }
    
    //ham getF() ta thiet ke co 2 tinh huong xu li
    //1. dua data tu te trong [0..20] -> tinh dung dc n! - done
    //2. dua data vao ca chon, am, >20; THIET KE CUA HAM LA NEM RA NGOAI LE
    //TAO KI VONG NGOAI LE XUAT HIEN KHI N < 0 || N> 20
    //rat mong ngoai le xuat hien voi n ca chon nay
    //neu ham nhan vao n < 0 hoac n > 20 va ham nem ra ngoai le
    //HAM CHAY DUNG NHU THIET KE -> XANH PHAI XUAT HIEN
    //neu ham nhan vao n < 0 hoac n > 20 va ham eo nem ra ngoai le
    // sure, ham chay sai thiet ke, sai ki vong, mau do
    
    //Test case:
    //input: -5
    //expected: IllegalArgumentException xuat hien
    //tinh huong bat thuong, ngoai le, ngoai du tinh, du lieu
    //la thu ko the do luong so sanh theo kieu value
    //ma chi co the do luong = cach chung co xuat hien hay ko
    //assertEquals() ko dung de so sanh 2 ngoai le
    //      equals() la bang nhau hay ko tren value!!!
    //
    //MAU DO DO EM, DO HAM DUNG LA CO NEM NGOAI LE THAT SU
    // NHUNG KO PHAI NGOAI LE NHU KI VONG - THUC SU KI VONG SAI
    // KO PHAI HAM NEM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtility.getFactorial(-5); //ham @Test chay, hay ham GetF() chay se nem ve ngoai le NumberFormatEx...
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-5); //ham @Test chay, hay ham GetF() chay se nem ve ngoai le NumberFormatEx...
    }
    // cach khac de bat ngoai le xuat hien, viet tu nhien hon!!!
    //xai Lambda
    //Test case: ham se nem ve ngoai le neu nhan vao 21.
    //tui can thay mau xanh khi choi voi 21 giai thua. 21!
    //
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVer(){
        //Assert.assertThrows(//tham so 1 : loai ngoai le muon so sanh,
        //tham so 2: doan code chay vang ra ngoai runnable), matcher);
        //Assert.assertThrows(IllegalArgumentException,()-> MathUtility.getFactorial(-5));
        //MathUtility.getFactorial(-5); //ham @Test chay, hay ham GetF() chay se nem ve ngoai le NumberFormatEx...
    }
    
    //Bat ngoai le, xem ham co nem ve ngoai le hay ko khi n ca chon
    //co nem, tuc la ham chay dung thiet ke -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        //chu dong kiem soat ngoai le!!!
        try {
        MathUtility.getFactorial(-5); 
        } catch (Exception e) {
            // bat try-catch la JUnit se ra xanh do da chu dong kiem soat ngoai le
            // nhung ko chac ngoai le minh can co xuat hien hay ko???
            // co doan code kiem soat dung ngoai le IllegalArgumentException xh
            Assert.assertEquals("Invalid Argument, N must be between 0 to 20", e.getMessage());
        }
    }
}

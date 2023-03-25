package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest {

//    @Test
//    void fourLaSoChan(){
//        Assert.assertTrue(Main.kiemTraSoChan(4));
//    }
//
//    @Test
//    void fiveLaSoLe(){
//        Assert.assertFalse(Main.kiemTraSoChan(5));
//    }

    @Test
    void aLaNguyenAm(){
        Assert.assertTrue(Main.kiemTraNguyenAm('a'));

    }
    @Test
    void eLaNguyenAm(){
        Assert.assertTrue(Main.kiemTraNguyenAm('e'));

    }
    @Test
    void iLaNguyenAm(){
        Assert.assertTrue(Main.kiemTraNguyenAm('i'));

    }
    @Test
    void oLaNguyenAm(){
        Assert.assertTrue(Main.kiemTraNguyenAm('o'));

    }
    @Test
    void uLaNguyenAm(){
        Assert.assertTrue(Main.kiemTraNguyenAm( 'u'));

    }

    @Test
    void bKhongPhaiNguyenAm(){
        Assert.assertFalse(Main.kiemTraNguyenAm('b'));
    }

    @Test
    void numberKhongPhaiNguyenAm(){
        Assert.assertFalse(Main.kiemTraNguyenAm('1'));
    }


}

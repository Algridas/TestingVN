package theInternet;

import org.testng.annotations.*;

public class exampletest {




    @BeforeSuite
    void beforeSuit(){
        System.out.println("beforeSuit");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("beforeTest");
    }

    @BeforeClass
    void beforeCLass(){
        System.out.println("beforeCLass");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @Test
    void tc1(){
        System.out.println("test 1");
    }
    @Test
    void tc2(){
        System.out.println("test 2");
    }
    @Test
    void tc3(){
        System.out.println("test 3");
    }
    @Test
    void tc4(){
        System.out.println("test 4");
    }
    @Test
    void tc5(){
        System.out.println("test 5");
    }

    @AfterSuite
    void afterSuit(){
        System.out.println("afterSuit");
    }
    @AfterTest
    void afterTest(){
        System.out.println("afterTest");
    }
    @AfterClass
    void afterCLass(){
        System.out.println("afterCLass");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("afterMethod");
    }


}

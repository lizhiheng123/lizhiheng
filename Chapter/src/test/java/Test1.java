import org.testng.annotations.*;

public class Test1 {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");

    }
    @Test
     public void testCase2(){
         System.out.println("这个是测试用例2");
     }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("beforedmethod这是在测试方法之前运行的");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("aftermethod,这事在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass这个是在类之前运行的方法");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("afterclassz这个是在类之后运行的方法");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void aftersuit(){
        System.out.println("aftersuit测试套件");

    }

}

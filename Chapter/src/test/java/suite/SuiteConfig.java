package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite运行了");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite运行了");
    }
}

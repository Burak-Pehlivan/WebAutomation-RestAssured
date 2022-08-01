package Chapter2.tests;

import Chapter2.tests.LelyCaseMethod.CaseMethod;
import org.testng.annotations.Test;

import static Chapter2.tests.LelyCaseMethod.BasePage.driver;

public class test {

    CaseMethod caseMethod;

    @Test (priority = 0)
    public void controlSearchingArea(){
        caseMethod = new CaseMethod(driver);
        caseMethod.SearchArea();
    }

    @Test (priority = 1)
    public void checkHappyText(){
        caseMethod = new CaseMethod(driver);
        caseMethod.CheckHappy();
    }

    @Test (priority = 2)
    public void verifyDocumentB(){
        caseMethod = new CaseMethod(driver);
        caseMethod.verifyDocument();
    }
}

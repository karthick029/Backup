package Listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNGlisteners implements IAnnotationTransformer ,IRetryAnalyzer {

int imaxretry =1;
@Override

public void transform (ITestAnnotation annotation ,Class testclass ,Constructor testConstructor , Method testmethod )
{ 

   annotation.setInvocationCount(2);
   annotation.setRetryAnalyzer(this.getClass());
   
     
  	

}
@Override
public boolean retry(ITestResult result){
	
	if (!result.isSuccess() && imaxretry <2) {
		imaxretry++;
		return true ;
		
	}else {
		return false ;
	}
}
	
}

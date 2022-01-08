import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ListenerConfig implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("\n" + "Test Started -> " + result.getName());
        System.out.println("Time ->" + result.getStartMillis());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Succeeded  -> " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed -> " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped -> " + result.getName());
        System.out.println("Test Skipped -> " + result.getSkipCausedBy());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Starting Execution: " + "\n");
        System.out.println("Test Tag Name: " + context.getName() + "\n" );
        ITestNGMethod methods[] = context.getAllTestMethods();
        System.out.println("Methods to execute: " + "\n");
        for (ITestNGMethod method : methods) {
            System.out.println(method);
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("\n" + "Finishing Execution -> " + context.getName() + "\n");
    }
}


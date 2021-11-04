//package JUnit.Run;
//
//import JUnit.Tests.TestJunit;
//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;
//import org.junit.runner.notification.Failure;
//
////https://coderlessons.com/tutorials/java-tekhnologii/vyuchit-junit/junit-kratkoe-rukovodstvo
//public class TestRunner {
//    public static void main(String[] args) {
//        Result result = JUnitCore.runClasses(TestJunit.class);
//
//        for (Failure failure : result.getFailures()) {
//            System.out.println(failure.toString());
//        }
//
//        System.out.println(result.wasSuccessful());
//    }
//}
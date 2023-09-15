public class OuterClass {

private static int staticInt = 10;
private int nonStaticInt = 20;
// static inner class
public static class StaticInnerClass {
public void accessOuterClassMembers() {
// access static members of outer class
System.out.println("StaticInt from StaticInnerClass: " + staticInt);
// cannot access non-static members of outer class from static inner class
// System.out.println("NonStaticInt from StaticInnerClass: " + nonStaticInt);
}
}
public class NonStaticInnerClass {
public void accessOuterClassMembers() {
// access static members of outer class
System.out.println("StaticInt from NonStaticInnerClass: " + staticInt);
// access non-static members of outer class
System.out.println("NonStaticInt from NonStaticInnerClass: " + nonStaticInt);
}
}
public static void main(String[] args) {
// create an instance of the outer class
OuterClass outerObj = new OuterClass();
// create an instance of the static inner class and access static members of outer class
StaticInnerClass staticInnerObj = new StaticInnerClass();
staticInnerObj.accessOuterClassMembers();
NonStaticInnerClass nonStaticInnerObj = outerObj.new NonStaticInnerClass();
nonStaticInnerObj.accessOuterClassMembers();
}
}
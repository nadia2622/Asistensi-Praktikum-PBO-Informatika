public class Example implements MyInterface{
    // implementing abstract method
    public void existingMethod(String str){
        System.out.println("String is: "+str);
    }
    public static void main(String[] args) {
        Example obj = new Example();
        obj.newMethod();
        MyInterface.anotherNewMethod();
        obj.existingMethod("Java 8 is easy to learn");
    }
}
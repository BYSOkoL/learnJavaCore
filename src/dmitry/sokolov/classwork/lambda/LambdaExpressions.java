package dmitry.sokolov.classwork.lambda;

public class LambdaExpressions {
    public static final String SOME_CONSTANT = "SOME CONSTANT";
//    public static class InnerStatic {
//        public void print() {
//            System.out.println(SOME_CONSTANT);
//        }
    public void method(){
        BoxPublic b = new BoxPublic();
    }
    public class BoxPublic {
        public void print() {
            System.out.println(SOME_CONSTANT);
        }
    }
}

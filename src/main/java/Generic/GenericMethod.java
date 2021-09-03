package Generic;

public class GenericMethod {
    public static <A> void genericMethod(A[] array){
        for(A item : array){
            System.out.print(item+" ");
        }
    }
}

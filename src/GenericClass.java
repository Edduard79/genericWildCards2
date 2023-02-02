public class GenericClass<T> {
    public GenericClass(){
    }

    private T t;

    public T getT(){
        return this.t;
    }
    public T setT(T valueToSet){
        return this.t = valueToSet;
    }

    public static <T> boolean isEqual(GenericClass<T> gc1, GenericClass<T> gc2){

        return gc1.getT().equals(gc2.getT());

    }


}

public class Tester {
    public Tester(){
    }

    public static void main(String[] args){

        GenericClass<Integer> firstElement = new GenericClass();
        GenericClass<Integer> secondElement = new GenericClass();
        GenericClass<String> thirdElement = new GenericClass();
        GenericClass<String> fourthElement = new GenericClass();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a String");
        fourthElement.setT("This is a String");

        System.out.println("First is equal to second? " + GenericClass.isEqual(firstElement,secondElement));
        System.out.println("Third is equal to fourth? " + GenericClass.isEqual(thirdElement,fourthElement));
        

    }
}

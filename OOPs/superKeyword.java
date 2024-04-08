package OOPs;

public class superKeyword {
    public static void main(String[] args) {
        
        // dog labraDog =new dog();

    }
    
}
class Animal{
    Animal(){
        System.out.println("animal is called...");
    }

}
class horse extends Animal{
    horse(){
        
        System.out.println("horse is called...");
    }
}
class dog extends Animal{
    dog(){
        super();
        System.out.println("dog is called...");
    }
}

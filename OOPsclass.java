abstract class Car{
    void start(){
        System.out.println("start");
    }


}
class BMW extends Car {
    void StartBMW(){
        System.out.println("BMW started");
    }

}
class Mazda extends Car{
    void startMazda(){
        System.out.println("mazda");
    }
}


public class OOPsclass {
    public static void main(String[] args) {
        BMW a = new BMW();
    a.start();
    a.StartBMW();
    }

   

    
}

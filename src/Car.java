import java.util.*;
interface Carfunction{
    void accelerator();
    void brake();
    void clutch();
}
class Cars implements Carfunction {
    public final void accelerator(){
        System.out.println("Accelarator");
    }
    public final void brake(){
        System.out.println("brake");
    }
    public final void clutch(){
        System.out.println("Clutch");
    }
}
class Maruti extends Cars{
    void interior(){
        System.out.println("XL6");
    }
    void wheel_size(){
        System.out.println("145/70 R12");
    }
    void color(String c){
        System.out.println(c);
    }
    void engine(){
        System.out.println("petrol engine");
    }
}
class Toyota extends Cars{
    void interior(){
        System.out.println("Computer aided design");
    }
    void wheel_size(){
        System.out.println("205/55 R 16");
    }
    void color(String c){
        System.out.println(c);
    }
    void engine(){
        System.out.println("diesel and gasoline engine");
    }
}
class Honda extends Cars{
    void interior(){
        System.out.println("human created designs");
    }
    void wheel_size(){
        System.out.println("185/60 R15");
    }
    void color(String c){
        System.out.println(c);
    }
    void engine(){
        System.out.println(" petrol engine");
    }
}
public class Car {
    public static void main(String args[]) {

        int choice;
        while(true){
        System.out.println("Enter your choice 1-Maruti\n2-Toyota\n3-Honda\n");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        switch (choice){
            case 1:Maruti m = new Maruti();
        System.out.println("Maruti details");
        m.accelerator();
        m.brake();
        m.clutch();
        m.interior();
        m.wheel_size();
        String c;
        Scanner s0 = new Scanner(System.in);
        System.out.println("enter color");
        c= s0.nextLine();
        m.color(c);
        m.engine();
        break;
            case 2:Toyota t = new Toyota();
        System.out.println("Toyota details");
        t.accelerator();
        t.brake();
        t.clutch();
        t.interior();
        t.wheel_size();
        String cc;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter color");
        cc= s1.nextLine();
        t.color(cc);
        t.engine();
        break;
            case 3:Honda h = new Honda();
        System.out.println("Honda details");
        h.accelerator();
        h.brake();
        h.clutch();
        h.interior();
        h.wheel_size();
        String ccc;
        Scanner s2 = new Scanner(System.in);
        System.out.println("enter color");
        ccc= s2.nextLine();
        h.color(ccc);
        h.engine();
        break;
            default:System.out.println("Invalid option");
    }
    }
    }
}

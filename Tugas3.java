package tugas3;

/**
 *
 * @author 20101290 I KetutAgus Suryawan
 */
public class Tugas3 {
    public static void main(String[] args) {
       convers_suhu suhu =new convers_suhu();
       suhu.SetC(4);
       System.out.println("Suhu Celsius to Fahrenheit   :"+suhu.Conversi("C2F"));
       
        suhu.SetF(5);
        System.out.println("Suhu Fahrenheit to Celsius   :"+suhu.Conversi("F2C"));
       
    }
    
}
    

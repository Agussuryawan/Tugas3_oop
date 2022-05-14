package tugas3;

/**
 *
 * @author 20101290 I Ketut Agus Suryawan
 */
public class convers_suhu {

    private double Hasil, C, F;
   
    public void SetC (double nilai){
    this.C = nilai;
}
    public void SetF (double nilai){
    this.F = nilai;
}
    public void setHasil(double hsl){
    this.Hasil = hsl;
}
    public double getHasil(){
     return this.Hasil;
}
        public double Conversi(String jns){
        if(jns == "C2F")    
        this.Hasil=C*9/5+ 32; 
    
        else if(jns == "F2C")
        this.Hasil= (F-32)*5/9; 
        return this.Hasil;
    }
}
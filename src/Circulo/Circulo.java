
package Circulo;


public class Circulo {

    public double radio;
    private final double Pi=3.14;
    public Circulo (){
    
}
    public Circulo(double radio){
      
        this.radio=radio;
    }
    public void setRadio(double radio){
        double r = 0;
        this.radio=r;
    }
    public double getRadio(){
        return radio;
    }
    public double calArea(){
        return Pi*Math.pow(radio,2);
    }
    public double calLonxitude(){
        return 2*Pi*radio;
    }
}
    
  
        
       
    
    


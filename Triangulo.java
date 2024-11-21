//Pruebas codigo
package poliformismopoligonos;


public class Triangulo extends Poligono {
    
    private double numlado1;
    private double numlado2;
    private double numlado3;
    
    
    
    public Triangulo(){}
    
    public Triangulo(double lado1,double lado2,double lado3){
        super(2);//Llamada al constructor de la clase padre
        this.numlado1=lado1;
        this.numlado2=lado2;
        this.numlado3=lado3;
    }

    public double getNumlado1() {
        return numlado1;
    }

    public double getNumlado2() {
        return numlado2;
    }

    public double getNumlado3() {
        return numlado3;
    }

    public void setNumlado1(double numlado1) {
        this.numlado1 = numlado1;
    }

    public void setNumlado2(double numlado2) {
        this.numlado2 = numlado2;
    }

    public void setNumlado3(double numlado3) {
        this.numlado3 = numlado3;
    }
    
    @Override
    public String toString(){
        return " Triangulo "+super.toString();
    }
    @Override
    public double area(){
        
    double p=(numlado1+numlado2+numlado3)/2;
      return Math.sqrt(p* (p-numlado1)*(p-numlado2)*(p-numlado3));
      
      
    }
    
    
    
}

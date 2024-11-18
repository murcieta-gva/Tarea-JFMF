//Comentario 1
package poliformismopoligonos;

public abstract class Poligono {
    
    private int numLados;
    
    
    public Poligono(){
        
    }
    public Poligono(int numLados){
        this.numLados=numLados;
    }
    
    public void setNumLados(int numLados){
        this.numLados=numLados;
    }
    public int getNumlados(){
        return numLados;
    }
    
    @Override
    public String toString(){
        
        return "tiene "+numLados+" lados";
        
    }
    public abstract double area(); 
    
}

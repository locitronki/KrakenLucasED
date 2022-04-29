public class Poligono {

    // Atributos
    protected String color;
    protected int lado;
    protected int num_lados;
    protected boolean relleno;
    protected boolean rotacion;
    protected int grados;

    //Cambios Kraken
    //Cambios Kraken 2

    //Constructor
    public Poligono(int lado, int num_lados, boolean relleno){
        this.lado = lado;
        this.num_lados = num_lados;
        this.relleno = relleno;
        rotacion = false;
        grados = 0;
    }
    public Poligono(int lado, int num_lados, boolean relleno, boolean rotacion, int grados){
        this.lado = lado;
        this.num_lados = num_lados;
        this.relleno = relleno;
        this.rotacion = rotacion;
        this.grados = grados;
    }

    //Métodos
    public void rotar(int num_grados){
        this.grados += num_grados;
    }
    public void aumentar(int cm){
        this.lado += cm;
    }
    public void reducir(int cm){
        if ((this.lado-=cm) <= 0){
            System.out.println("El lado no puede ser negativo");
        }else{
            this.lado -= cm;
        }
    }
    public void rellenar(){
        this.relleno = true;
    }

}

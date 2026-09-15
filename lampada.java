public class lampada {
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }

    void imprimir(){
        if (this.ligada == true){
            System.out.println("Lampada ligada");
        } else {
            System.out.println("Lampada desligada");
        }
    }
}

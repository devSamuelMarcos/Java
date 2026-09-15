public class MostrarImpar {
    
    public static void main(String[] args) {
        MostrarImpar ei;
        ei = new MostrarImpar();
        ei.exibir();
    }

    public void exibir(){ // metodo
        int contador = 1;

        while (contador <= 30){
            if (contador % 2 != 0) {
                System.out.println(contador+ " é impar");
            } else if (contador % 2 == 0) {
                System.out.println(contador+ " é par");
            }
            contador++;
        }
    } // fim do metodo exibir
}

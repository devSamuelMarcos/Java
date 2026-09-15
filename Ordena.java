import java.util.*; // o usuario entra com dois valores e o sistema os ordena

public class Ordena {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        int x, y;
        System.out.println("Digite o valor de x:");
        x = infor.nextInt();
        System.out.println("Digite o valor de y:");
        y = infor.nextInt();

        if (x > y) {
            System.out.println("y = "+y +"\nx = "+ x);
        } else {
            System.out.println("x = " + x +"\ny = "+ y);
        }
    }
}

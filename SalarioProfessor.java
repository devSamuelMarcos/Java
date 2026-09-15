public class SalarioProfessor {
    public static void main(String[] args) {

        int ht; // horas trabalhadas do mes

        double vh; // valor da hora aula

        double pd; // percentual de desconto

        double sb; // salário bruto obtido pela multiplicaçao de ht e vh

        double td; // total de desconto obtido pela divisao de pd por 100 multiplicado por sb

        double sl; // salario liquido calculado pela subtraçao dos descontos do sb
        
        //Exibir na tela os valores do salario liquido e do salario bruto

        ht = 70;
        vh = 30.0D;
        pd = 7.5D;
        sb = ht * vh;
        td = (pd / 100) * sb;
        sl = sb - td;

        System.out.println("Salario bruto:\n" +sb);
        System.out.println("Salario liquido:\n" + sl);
    }
}
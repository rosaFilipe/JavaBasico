package questoes;

public class Idade {

    private int anos;
    private  int meses;
    private  int dias;

    public Idade(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public void calcular(){
        int a = this.anos;
        int m = this.meses;
        int d = this.dias;
        int anoTotal = 356;
        int mesTotal = 30;

        int soma = (a*anoTotal)+(m*mesTotal)+d;

        System.out.println(a+" anos, "+m+" meses e "+d+" dias = "+soma+" dias.");



    }
}

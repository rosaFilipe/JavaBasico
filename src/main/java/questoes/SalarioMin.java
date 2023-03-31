package questoes;

import java.text.NumberFormat;
import java.util.Locale;

public class SalarioMin {
    private double salario;

    public SalarioMin(double salario) {
        this.salario = salario;
    }

    public void qtsSalariosMin(){
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt","BR"));
        double s = this.salario;
        double salarioMin = 1320.00;
        int qts = (int) (s/salarioMin);


        System.out.println("O salario R$"+nf.format(s)+" são "+qts+" salarios minimos.");
    }
}

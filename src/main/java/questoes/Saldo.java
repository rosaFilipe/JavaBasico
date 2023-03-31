package questoes;

import java.text.NumberFormat;
import java.util.Locale;

public class Saldo {
    private double saldo;

    public Saldo(double saldo) {
        this.saldo = saldo;
    }

    public void porcentagem(){
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt","BR"));
        double s = this.saldo;
        double p = (s*0.01)+s;
        System.out.println("O saldo reajustado é R$"+nf.format(p)+".");

    }
}

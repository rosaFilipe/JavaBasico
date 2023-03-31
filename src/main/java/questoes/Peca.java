package questoes;

import java.text.NumberFormat;
import java.util.Locale;

public class Peca {
    private double ipi;
    private String codigo1;
    private double valorUni1;
    private int quantidadeP1;
    private String codigo2;
    private double valorUni2;
    private int quantidadeP2;

    public Peca(double ipi, String codigo1, double valorUni1, int quantidadeP1, String codigo2, double valorUni2, int quantidadeP2) {
        this.ipi = ipi;
        this.codigo1 = codigo1;
        this.valorUni1 = valorUni1;
        this.quantidadeP1 = quantidadeP1;
        this.codigo2 = codigo2;
        this.valorUni2 = valorUni2;
        this.quantidadeP2 = quantidadeP2;
    }

    public void calcularIPI(){
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt","BR"));
        double ipi = this.ipi;
        String c1 = this.codigo1;
        double v1 = this.valorUni1;
        int q1 = this.quantidadeP1;
        String c2 = this.codigo2;
        double v2 = this.valorUni2;
        int q2 = this.quantidadeP2;

        double calculo = (((v1*q1)+(v2*q2))*((ipi/100)+1));

        System.out.println("Peça "+c1+" - valor: "+nf.format(v1)+" - quantidade: "+q1+".");
        System.out.println("Peça "+c2+" - valor: "+nf.format(v2)+" - quantidade: "+q2+".");
        System.out.println("IPI: "+nf.format(ipi)+".");
        System.out.println("Valor total: R$"+nf.format(calculo)+".");

    }
}

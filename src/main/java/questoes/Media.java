package questoes;

import java.text.NumberFormat;
import java.util.Locale;

public class Media {

    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int n6;

    public Media(int n1, int n2, int n3, int n4, int n5, int n6) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
    }

    public void mediaAri(){
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt","BR"));
        int n1 = this.n1;
        int n2 = this.n2;
        int n3 = this.n3;
        int n4 = this.n4;
        int n5 = this.n5;
        int n6 = this.n6;
        float media1 = (n1+n2+n3)/3;
        float media2 = (n4+n5+n6)/3;

        float somaM = media1+media2;
        float mediaM = somaM/2;
        System.out.println("A média dos números "+n1+", "+n2+", "+n3+" = "+ nf.format(media1)+".");
        System.out.println("A média dos números "+n4+", "+n5+", "+n6+" = "+ nf.format(media2)+".");
        System.out.println("A soma das medias = "+nf.format(somaM)+".");
        System.out.println("A média das medias = "+nf.format(mediaM)+".");

    }
}

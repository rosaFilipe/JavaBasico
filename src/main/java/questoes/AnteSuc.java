package questoes;

public class AnteSuc {
    private int numero;

    public AnteSuc(int numero) {
        this.numero = numero;
    }

    public void antSuc(){
        int n = this.numero;
        int ant = n-1;
        int suc = n+1;
        System.out.println("Numero "+n+" seu antecessor = "+ant+" e seu sucessor = "+ suc+".");
    }
}

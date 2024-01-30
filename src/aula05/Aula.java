package aula05;

public class Aula {
    public static void main(String[] args) {

    Banco b1 = new Banco();
    b1.setNumConta(123456);
    b1.setDono("Gabriel");
    b1.abrirConta("CC");
    b1.estadoAtual();

    Banco b2 = new Banco();
    b2.setNumConta(987654321);
    b2.setDono("Marcella");
    b2.abrirConta("CP");
    b2.estadoAtual();

    Banco b3 = new Banco();
    b3.setNumConta(13579);
    b3.setDono("Chalotte");
    b3.abrirConta("CP");
    b3.estadoAtual();

    Banco b4 = new Banco();
    b4.setNumConta(246810);
    b4.setDono("Cristina");
    b4.abrirConta("CC");
    b4.estadoAtual();

    }
}
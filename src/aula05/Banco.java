package aula05;

public class Banco {
    protected String tipo;
    private String dono;
    private boolean status;
    public int numConta;
    private float saldo;

    public Banco() {
        this.setStatus(false);
        this.setSaldo(0);
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {return numConta;}

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getDono() {
        return dono;
    }

    public boolean getStatus() {
        return status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Nao é possível fechar pois tem saldo disponível na conta");
        } else if (getSaldo() < 0) {
            System.out.println("Nao é possível fechar pois tem saldo negativo na conta");
        } else if (getSaldo() == 0) {
            System.out.println("A conta pode ser fechada!");
            setStatus(false);
        }
    }

    public void depositar(int v) {
        if (getStatus()) {
            System.out.println("Pode depositar");
        } else if (getSaldo() >= 0) {
            setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta do: " + getDono());
        } else {
            System.out.println("Dívida recorrente, pague antes");
        }
    }

    public void sacar(int v) {
        if (getStatus()) {
            System.out.println("Pode sacar");
        } else if (getSaldo() > v) {
            setSaldo(getSaldo() - v);
            System.out.println("Saque realizado com sucesso" + getDono());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (getTipo() == "CC") {
            v = 12;
        } else if (getTipo() == "CP") {
            v = 20;
        } else if (getStatus()) {
            setSaldo(getSaldo() - v);
            System.out.println("Sua mensalidade foi paga" + getDono());
        } else {
            System.out.println("Impossível ser paga pois a conta esta fechada");
        }
    }

    public void estadoAtual() {
        System.out.println("--------------------");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("--------------------");
    }
}

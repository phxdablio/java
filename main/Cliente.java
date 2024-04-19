package main;

import java.util.ArrayList;

public class Cliente implements Runnable {
    private String nome;
    private double saldo;
    private Loja loja1;
    private Loja loja2;

    public Cliente(String nome, double saldo, Loja loja1, Loja loja2) {
        this.nome = nome;
        this.saldo = saldo;
        this.loja1 = loja1;
        this.loja2 = loja2;
    }

    @Override
    public void run() {
        ArrayList<Double> valoresCompras = new ArrayList<>();
        valoresCompras.add(100.0);
        valoresCompras.add(200.0);

        int index = 0;
        while (saldo >= 100 && index < valoresCompras.size()) {
            if (index % 2 == 0) {
                loja1.efetuarCompra(this, valoresCompras.get(index));
            } else {
                loja2.efetuarCompra(this, valoresCompras.get(index));
            }
            index++;
        }
    }

    public synchronized void atualizarSaldo(double valorCompra) {
        saldo -= valorCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void realizarCompras() {
        Thread clienteThread = new Thread(this);
        clienteThread.start();
        try {
            clienteThread.join(); // Espera até que a thread do cliente termine suas compras
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    Object getLoja1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getLoja2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

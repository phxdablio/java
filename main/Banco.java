package main;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {
    private Map<String, Conta> contas;
    private Lock lock;

    public Banco() {
        this.contas = new HashMap<>();
        this.lock = new ReentrantLock();
    }

    public void adicionarConta(String nome, Conta conta) {
        contas.put(nome, conta);
    }

    public void transferir(String origem, String destino, double valor) {
        lock.lock();
        try {
            Conta contaOrigem = contas.get(origem);
            Conta contaDestino = contas.get(destino);

            if (contaOrigem == null || contaDestino == null) {
                System.out.println("Conta de origem ou destino não encontrada.");
                return;
            }

            if (contaOrigem.getSaldo() >= valor) {
                contaOrigem.sacar(valor);
                contaDestino.depositar(valor);
                System.out.println("Transferência de R$" + valor + " da conta " + origem + " para a conta " + destino + " realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente na conta de origem.");
            }
        } finally {
            lock.unlock();
        }
    }
}

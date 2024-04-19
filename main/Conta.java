package main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Conta {
    private double saldo;
    private Lock lock;

    public Conta() {
        this.saldo = 0;
        this.lock = new ReentrantLock();
    }

    public void depositar(double valor) {
        lock.lock();
        try {
            this.saldo += valor;
        } finally {
            lock.unlock();
        }
    }

    public void sacar(double valor) {
        lock.lock();
        try {
            if (saldo >= valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente na conta");
            }
        } finally {
            lock.unlock();
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

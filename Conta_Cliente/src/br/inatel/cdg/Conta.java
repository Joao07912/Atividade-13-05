package br.inatel.cdg;

import java.util.Arrays;
import java.util.HashSet;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    HashSet<Cliente> cliente;

    public Conta(HashSet<Cliente> cliente) {
        this.cliente = new HashSet();
    }

    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        }
        else {
            saldo -= valor;
        }
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void mostrarInfo(Conta conta, HashSet<Cliente> clientes)
    {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Erro: " + e);
            }

        }
    }


    public void setCliente(HashSet<Cliente> cliente) {
        this.cliente = cliente;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}

package br.inatel.cdg;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Cliente cliente[] = new Cliente[3];

        HashSet<Cliente> clienteHashMap = new HashSet<Cliente>();
        Conta conta = new Conta(clienteHashMap);


        cliente[0] = new Cliente();
        cliente[1] = new Cliente();
        cliente[2] = new Cliente();

        cliente[2]= null;

        cliente[0].setCpf("000000000-00");
        cliente[0].setNome("Joao");

        cliente[1].setCpf("11111111-11");
        cliente[1].setNome("Lucas");

        clienteHashMap.add(cliente[0]);
        clienteHashMap.add(cliente[1]);
        clienteHashMap.add(cliente[2]);

        conta.setCliente(clienteHashMap);

        conta.setLimite(4000);
        conta.setSaldo(500);
        conta.setNumero(1234);

        conta.mostrarInfo(conta, clienteHashMap);

        System.out.println("Código Finalizado");




    }
}
package service;

import domain.ClienteJuridico;

import java.util.ArrayList;
import java.util.List;

public class ClienteJuridicoService {

    List<ClienteJuridico> clienteJuridicoList = new ArrayList<>();

    public void salvar(ClienteJuridico clienteJuridico) {
        if (clienteJuridico.getCnpj().length() != 14) {
            System.out.println("Ele nao ẽ cpf");
        }

        clienteJuridicoList.add(clienteJuridico);
    }
}

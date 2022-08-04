package service;

import domain.ClienteJuridico;

import java.util.ArrayList;
import java.util.List;

public class ClienteJuridicoService {

    List<ClienteJuridico> clienteJuridicoList = new ArrayList<>();

    public void salvar(ClienteJuridico clienteJuridico) {
        clienteJuridicoList.add(clienteJuridico);
    }
}

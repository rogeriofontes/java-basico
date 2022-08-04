package service;

import domain.ClienteFisico;

import java.util.ArrayList;
import java.util.List;

public class ClienteFisicoService {
    List<ClienteFisico> clienteFisicoList = new ArrayList<>();

    public void salvar(ClienteFisico clienteFisico) {
        clienteFisicoList.add(clienteFisico);
    }
}

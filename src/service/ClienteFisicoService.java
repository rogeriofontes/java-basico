package service;

import domain.ClienteFisico;

import java.util.ArrayList;
import java.util.List;

public class ClienteFisicoService {
    List<ClienteFisico> clienteFisicoList = new ArrayList<>();

    public void salvar(ClienteFisico clienteFisico) {
        if (clienteFisico.getCpf().length() != 11) {
            System.out.println("Ele nao ẽ cpf");
        }

        clienteFisicoList.add(clienteFisico);
    }
}

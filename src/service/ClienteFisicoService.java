package service;

import domain.ClienteFisico;

import java.util.ArrayList;
import java.util.List;

public class ClienteFisicoService {
    List<ClienteFisico> clienteFisicoList = new ArrayList<>();

    public List<ClienteFisico> salvar(ClienteFisico clienteFisico) {
        if (!clienteFisico.validarNumeroDocument()) {
            System.out.println("Ele nao ẽ cpf");
        }

        clienteFisicoList.add(clienteFisico); // tarefa 1

        //TODO - enviar um email de cadatro - tarefa 2
        enviaEmail(clienteFisico.getEmail());

        //return clienteFisicoList; //tarefa 3
        return listaCliente();
    }

    public void enviaEmail(String email) {
        System.out.println("Envia email para: " + email);
    }


    public List<ClienteFisico> listaCliente() {
        return clienteFisicoList;
    }

}

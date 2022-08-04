import domain.ClienteFisico;
import domain.ClienteJuridico;
import service.ClienteFisicoService;
import service.ClienteJuridicoService;

public class CadastrarCliente {
    public static void main(String[] args) {

        ClienteFisicoService clienteFisicoService = new ClienteFisicoService();

        ClienteFisico rogerioPessoaFisica = new ClienteFisico();

        rogerioPessoaFisica.setId(1l);
        rogerioPessoaFisica.setNomw("Rogerio");
        rogerioPessoaFisica.setCpf("cpf");
        rogerioPessoaFisica.setEndereco("endereco");
        rogerioPessoaFisica.setEmail("root@local");

        clienteFisicoService.salvar(rogerioPessoaFisica);

        System.out.println("Dados cadastrados PF"+rogerioPessoaFisica.toString());

        ClienteJuridicoService clienteJuridicoService = new ClienteJuridicoService();

        ClienteJuridico rogerioPessoaJuridico = new ClienteJuridico();

        rogerioPessoaJuridico.setId(1l);
        rogerioPessoaJuridico.setRazaoSocial("Rogerio");
        rogerioPessoaJuridico.setCnpj("cpf");
        rogerioPessoaJuridico.setEndereco("endereco");
        rogerioPessoaJuridico.setEmail("root@local");

        clienteJuridicoService.salvar(rogerioPessoaJuridico);
        System.out.println("Dados cadastrados PF"+rogerioPessoaJuridico.toString());
    }
}

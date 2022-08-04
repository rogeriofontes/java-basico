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
        rogerioPessoaFisica.setCpf("12345678901");
        rogerioPessoaFisica.setEndereco("endereco");
        rogerioPessoaFisica.setEmail("root@local");

        clienteFisicoService.salvar(rogerioPessoaFisica);

        System.out.println("Dados cadastrados PF"+rogerioPessoaFisica.toString());

        ClienteJuridicoService clienteJuridicoService = new ClienteJuridicoService();

        ClienteJuridico rogerioPessoaJuridico = new ClienteJuridico();

        rogerioPessoaJuridico.setId(1l);
        rogerioPessoaJuridico.setRazaoSocial("Rogerio");
        rogerioPessoaJuridico.setCnpj("12345678901234");
        rogerioPessoaJuridico.setEndereco("endereco");
        rogerioPessoaJuridico.setEmail("root@local");

        clienteJuridicoService.salvar(rogerioPessoaJuridico);
        System.out.println("Dados cadastrados PF"+rogerioPessoaJuridico.toString());
    }
}

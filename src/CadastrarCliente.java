import domain.ClienteFisico;
import domain.ClienteJuridico;

public class CadastrarCliente {
    public static void main(String[] args) {
        ClienteFisico rogerioPessoaFisica = new ClienteFisico();

        rogerioPessoaFisica.setId(1l);
        rogerioPessoaFisica.setNomw("Rogerio");
        rogerioPessoaFisica.setCpf("cpf");
        rogerioPessoaFisica.setEndereco("endereco");
        rogerioPessoaFisica.setEmail("root@local");

        System.out.println("Dados cadastrados PF"+rogerioPessoaFisica.toString());

        ClienteJuridico rogerioPessoaJuridico = new ClienteJuridico();

        rogerioPessoaJuridico.setId(1l);
        rogerioPessoaJuridico.setRazaoSocial("Rogerio");
        rogerioPessoaJuridico.setCnpj("cpf");
        rogerioPessoaJuridico.setEndereco("endereco");
        rogerioPessoaJuridico.setEmail("root@local");

        System.out.println("Dados cadastrados PF"+rogerioPessoaJuridico.toString());
    }
}

package domain;

public class ClienteFisico extends Cliente {
    private String nomw;
    private String cpf;

    public String getNomw() {
        return nomw;
    }

    public void setNomw(String nomw) {
        this.nomw = nomw;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "domain.ClienteFisico{" +
                "nomw='" + nomw + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean validarNumeroDocument() {
        if (cpf.length() != 11) {
            return false;
        }

        return true;
    }
}

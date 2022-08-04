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
        return "ClienteFisico{" +
                "nomw='" + nomw + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

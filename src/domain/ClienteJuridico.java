package domain;

public class ClienteJuridico extends Cliente  {
    private String razaoSocial;
    private String cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }

    @Override
    public boolean validarNumeroDocument() {
        if (cnpj.length() != 14) {
            return false;
        }
        return true;
    }
}

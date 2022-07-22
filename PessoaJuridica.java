public class PessoaJuridica extends Pessoa {

    private Long cnpj;

    private Double prolabore;

    @Override
    public Double financeiro() {
        return prolabore;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Double getProlabore() {
        return prolabore;
    }

    public void setProlabore(Double prolabore) {
        this.prolabore = prolabore;
    }
}

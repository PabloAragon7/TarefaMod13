public class PessoaFisica extends Pessoa {

    private Long cpf;

    private Double salario;

    @Override
    public Double financeiro() {
        return salario;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}

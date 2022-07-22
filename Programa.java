public class Programa {

    public static void main(String args[]) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Pablo ");
        pessoaFisica.setSobrenome("Aragon ");
        pessoaFisica.setEndereço("Rua Camara");
        pessoaFisica.setCpf(370L);
        pessoaFisica.setSalario(2500d);
        System.out.println(pessoaFisica.getNome() + pessoaFisica.getSobrenome() + " mora na " + pessoaFisica.getEndereço());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("Salario: " + pessoaFisica.getSalario());


        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Felippe ");
        pessoaJuridica.setSobrenome("Macedo ");
        pessoaJuridica.setEndereço("Rua Doispp");
        pessoaJuridica.setCnpj(123456L);
        pessoaJuridica.setProlabore(5000d);
        System.out.println(pessoaJuridica.getNome() + pessoaJuridica.getSobrenome() + " mora na " + pessoaJuridica.getEndereço());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Prolabore: " + pessoaJuridica.getProlabore());


    }
}



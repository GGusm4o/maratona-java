package academy.maratonajava.poo.heranca.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco address;

    public void imprimir() {
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Rua: "+this.address.getStreet() + "\n" + "CEP: " + this.address.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getAddress() {
        return address;
    }

    public void setAddress(Endereco address) {
        this.address = address;
    }
}

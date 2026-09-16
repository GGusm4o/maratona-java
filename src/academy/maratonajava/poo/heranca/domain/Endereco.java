package academy.maratonajava.poo.heranca.domain;

public class Endereco {
    private String street;
    private String zipCode;

    public void imprime() {
        Pessoa p = new Pessoa();
        p.name = "sasa";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

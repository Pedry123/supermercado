public class Alimento extends Produto {
    private String validade;
    private float temperaturaArmazenamento;


    public Alimento(String nome, float peso, String fornecedor, String codigoBarras, String categoria, String validade, float temperaturaArmazenamento) {
        super(nome, peso, fornecedor, codigoBarras, categoria);
        this.validade = validade;
        this.temperaturaArmazenamento = temperaturaArmazenamento;
    }


    public String getValidade() {
        return validade;
    }


    public void setValidade(String validade) {
        this.validade = validade;
    }


    public float getTemperaturaArmazenamento() {
        return temperaturaArmazenamento;
    }


    public void setTemperaturaArmazenamento(float temperaturaArmazenamento) {
        this.temperaturaArmazenamento = temperaturaArmazenamento;
    }
    
    
}

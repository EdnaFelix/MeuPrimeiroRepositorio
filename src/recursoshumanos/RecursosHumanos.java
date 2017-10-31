
package recursoshumanos;

class Funcionario{
    private String nome;
    private double salario;
    private String cpf;
    private String departamento;
    private int faltas;
    
        
    void recebeAumento(double aumento){
        this.salario += aumento;
    }
    
    double calculaGanhoAnual(){
        double ganhoAnual;        
        ganhoAnual = this.salario * 12;
        
        return ganhoAnual;
    }
    
    double descontoFalta(){
        double aReceber;
        int mes = 30;
        int diasTrabalhados;
        double salarioDia;
        
        diasTrabalhados = mes - faltas;
        salarioDia = this.salario/mes;
        
        aReceber = diasTrabalhados * salarioDia;
                
        return aReceber;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public int getFaltas(){
        return faltas;
    }
    
    public void setFaltas(int faltas){
        this.faltas = faltas;
    }
    
     void mostra(){
 
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + salario);
        System.out.println("Salário Anual: " + calculaGanhoAnual());
        System.out.println("Salário com desconto: " + descontoFalta());
    }
}


public class RecursosHumanos {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.setNome("Edna");
        f1.setSalario(4000);
        f1.setFaltas(4);
        f1.recebeAumento(700);
        f1.descontoFalta();
        
        f1.mostra();          
    }  
}


package br.senac.banco;
public class Emprestim {

    public static void main(String[] args) {
        double valorEmprestimo = 5000.0; // Valor do empréstimo (exemplo)
        int quantidadeMeses = 12; // Quantidade de meses (exemplo)
        double taxaJurosMensal = 2.0; // Taxa de juros mensal (2%)

        // Cálculo dos juros compostos
        double taxaJurosDecimal = taxaJurosMensal / 100.0;
        double valorParcela = valorEmprestimo * Math.pow(1 + taxaJurosDecimal, quantidadeMeses) / quantidadeMeses;

     //   System.out.println("Valor da parcela mensal: R$" + valorParcela);
        
        // Arredondamento para o valor mais próximo (sem casas decimais)
        long valorParcelaArredondado = Math.round(valorParcela);

        System.out.println("Valor da parcela mensal: R$" + valorParcelaArredondado);
    }
}

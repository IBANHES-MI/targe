public class FaturamentoDistribuidora {
    public static void main(String[] args) {

        double[] faturamentoDiario = {1200.50, 0.0, 2300.75, 1900.30, 3000.0, 0.0, 2700.5, 2000.0, 1500.0, 1300.0, 
                                      2100.75, 2500.0, 2400.0, 2700.0, 1000.0, 2900.0, 2300.0, 1800.0, 0.0, 0.0, 
                                      2200.0, 1400.0, 1600.0, 2000.0, 3000.0, 2500.0, 2600.0, 1500.0, 2400.0, 2300.0};

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0;
        

        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }
        
  
        double mediaMensal = somaFaturamento / diasComFaturamento;
        
        int diasAcimaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: R$ " + menorFaturamento);
        System.out.println("Maior valor de faturamento: R$ " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média mensal: " + diasAcimaMedia);
    }
}

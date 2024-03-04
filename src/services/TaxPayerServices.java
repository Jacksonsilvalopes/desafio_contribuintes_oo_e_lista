package services;


import entities.TaxPayer;

import java.util.List;

public class TaxPayerServices {

    private List<TaxPayer> taxPayerList;
    public TaxPayerServices(List<TaxPayer> taxPayerList) {
        this.taxPayerList = taxPayerList;

    }

    public void calculate() {

      int n = 1;

          for (TaxPayer tax: taxPayerList){

              System.out.println();
              System.out.println("Resumo do " + n + "o contribuinte:  ");
              System.out.printf("Imposto bruto total: %.2f %n", tax.grossTax());
              System.out.printf("Abatimento: %.2f %n", tax.taxRebate());
              System.out.printf("Imposto devido: %.2f %n", tax.netTax());

          n++;

          }
    }

}

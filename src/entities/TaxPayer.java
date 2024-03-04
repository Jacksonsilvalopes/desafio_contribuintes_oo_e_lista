package entities;

public class TaxPayer {
    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;


    public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double getSalaryIncome() {
        return salaryIncome;
    }



    public double getServicesIncome() {
        return servicesIncome;
    }


    public double getCapitalIncome() {
        return capitalIncome;
    }


    public double getHealthSpending() {
        return healthSpending;
    }



    public double getEducationSpending() {
        return educationSpending;
    }



    public double salaryTax() {
        double salaryMonthly = salaryIncome / 12;
        if (salaryMonthly < 3000.0) {
            return 0.0;
        } else if (salaryMonthly >= 3000.0 & salaryMonthly < 5000.0) {
            return salaryIncome * 0.1;
        } else {
            return salaryIncome * 0.2;
        }
    }

    public double servicesTax() {
        if (servicesIncome > 0.0) {
            return servicesIncome * 0.15;
        }
        return 0.0;
    }

    public double capitalTax() {
        if (capitalIncome > 0.0) {
            return capitalIncome * 0.2;
        }
        return 0.0;
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate() {
        double intentionRebate = healthSpending + educationSpending;
        if (intentionRebate > grossTax() * 0.3) {
            return grossTax() * 0.3;
        }
        return intentionRebate;
    }

    public double netTax() {
        if (taxRebate() == grossTax() * 0.3) {
            return grossTax() - grossTax() * 0.3;
        }
        return grossTax() - taxRebate();
    }

}


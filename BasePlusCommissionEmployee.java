// Fig. 9.11: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class inherits from CommissionEmployee 
// and accesses the superclass�s private data via inherited 
// public methods.
public class BasePlusCommissionEmployee {
   // initializing the object
   private CommissionEmployee CommissionEmployee;
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
         double commissionRate, double baseSalary) {
      this.CommissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales,
            commissionRate);
      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // return first name
   public String getFirstName() {
      return CommissionEmployee.getFirstName();
   }

   // return last name
   public String getLastName() {
      return CommissionEmployee.getLastName();
   }

   // return social security number
   public String getSocialSecurityNumber() {
      return CommissionEmployee.getSocialSecurityNumber();
   }

   // return gross sales amount
   public double getGrossSales() {
      return CommissionEmployee.getGrossSales();
   }

   // return commission rate
   public double getCommissionRate() {
      return CommissionEmployee.getCommissionRate();
   }

   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // return base salary
   public double getBaseSalary() {
      return baseSalary;
   }

   // calculate earnings
   public double earnings() {
      return getBaseSalary() + CommissionEmployee.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
      return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
   }
}

import java.time.LocalDate;
import java.util.Locale;

public class Emplooye {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Emplooye(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsWorked = LocalDate.now().getYear() - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    public double calculateTotalSalary() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        return salary - taxAmount + bonusAmount + raiseAmount;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Adı: %s\nMaaşı: %.1f\nÇalışma Saati: %d\nBaşlangıç Yılı: %d\nVergi: %.1f\nBonus: %.1f\nMaaş Artışı: %.1f\nVergi ve Bonuslar ile birlikte maaş: %.1f\nToplam Maaş: %.1f",
                name, salary, workHours, hireYear, tax(), bonus(), raiseSalary(), calculateTotalSalary(), salary + raiseSalary());
    }

    public static void main(String[] args) {
        Emplooye employee = new Emplooye("ahmet", 3000.0, 55, 1995);
        System.out.println(employee.toString());
    }
}

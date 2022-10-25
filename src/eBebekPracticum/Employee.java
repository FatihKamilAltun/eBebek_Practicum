package eBebekPracticum;

public class Employee {

    public String name;
    public double salary, workHours;
    public int hireYear;

    // Yukarida istenen degerlerin hesaplanamabilmesi icin variable'lari uygun veri tiplerinde tanimladik

    public Employee() {

    }

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Yukarida test case'de istenen sekilde 4 parametreli constructor olusturduk

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    // Yukarida bizden istenen verileri degistirmek ve gerektiginde getirmek icin getter ve setter methodlari olsuturduk.


    public double tax() {
        if (salary < 1000) {
            return 0;
        } else return salary * 3 / 100;
    }


    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }


    public double raiseSalary() {
        if (2021 - hireYear < 10) {
            return salary * 5 / 100;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            return salary * 10 / 100;
        } else if (2021 - hireYear > 19) {
            return salary * 15 / 100;
        } else return 0;
    }


    public double salaryWithBonusMinusTax() {
        return salary + bonus() - tax();

    }

    public double totalSalary() {
        return salary + bonus() - tax() + raiseSalary();
    }

    // Yukarida bizden istenen bilgileri hesaplamak icin methodlar olusturduk.


    @Override
    public String toString() {
        return
                "\nName : " + name +
                        "\nSalary : " + salary +
                        "\nWork Hours : " + workHours +
                        "\nHire Year : " + hireYear +
                        "\nTax : " + tax() +
                        "\nBonus Payment : " + bonus() +
                        "\nRaise Salary : " + raiseSalary() +
                        "\nSalary Plus Bonus Minus Tax : " + salaryWithBonusMinusTax() +
                        "\nTotal Salary : " + totalSalary();
    }

    // Yukarida bizden istenecek olan tum bilgileri yazdirmak icin toString() methodu olusturduk.

}

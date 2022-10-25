package eBebekPracticum;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Employee employee=new Employee();
        Scanner scan=new Scanner(System.in);


        System.out.print("Calisanin isim ve soyismini giriniz : ");
        employee.setName(scan.nextLine());

        System.out.print("Calisanin maasini giriniz : ");
        employee.setSalary(scan.nextDouble());

        System.out.print("Calisanin haftalik maasini giriniz : ");
        employee.setWorkHours(scan.nextDouble());

        System.out.print("Calisanin ise giris yilini giriniz : ");
        employee.setHireYear(scan.nextInt());

        System.out.println(employee.toString());

    }
}

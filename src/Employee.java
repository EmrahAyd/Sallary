public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double bonus;
    double taxRate;
    double kidemTaz;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear= 2021 - hireYear;
        this.taxRate= salary*0.03;
    }
   void tax(){
//Alta taşındı...
    }

  void bonus(){
        if (workHours>40)
            this.bonus=(workHours-40)*30;

    }

  void   raiseSalary(){
        if (hireYear<10){
            this.kidemTaz= (double) (salary * 0.05);
        }
        else if (hireYear>9 && hireYear<20){
            kidemTaz = (double) (salary * 0.10);
        }
        else if (hireYear>20){
            kidemTaz = (double) (salary * 0.15);
        }
    }

    void printOut(){

        System.out.println("Adı :" + name);
        System.out.println("Ham maaş :" + salary);
        System.out.println("Kıdem Tazminatı :" + kidemTaz);
        if (salary<=1000){
            System.out.println("Vergilendirilemez.");
        }
        else if (salary>1000) {
            System.out.println("Vergi Miktarı : " + taxRate);
        }
        System.out.println("Mesai ücreti : " + bonus);
        System.out.println("Net Ele Geçen Maaş Miktarı: " + (bonus + salary + kidemTaz+(-taxRate)));
        System.out.println("Çalışma süresi (yıl): " + hireYear);
    }
    }

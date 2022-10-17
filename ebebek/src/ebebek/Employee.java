package ebebek;

public class Employee {


    String name= "Enes";
    double salary=16000;
    int workHours=55;
    int hireYear=2007;


public void Employe( String isim,double maas,int hftlkclisma,int bslmyil){
    this.name=isim;
    this.salary=maas;
    this.workHours=hftlkclisma;
    this.hireYear=bslmyil;
}

public double tax() {
    double vergi = 0;
    if(salary>1000) {
        vergi=salary * 0.03;

    }
    return vergi;


}
public double bonus() {
    double bonus1=0;
    double mesai;
    if(workHours>40) {
        mesai=workHours-40;
        bonus1=mesai*30;

    }
    return bonus1;
}

public double raiseSalary() {
    double eklenecekzam;
    int mevcutyil=2021;
    double toplamaas;
    if(mevcutyil-hireYear<10) {
    	toplamaas= salary*1.05;

    }
    else if(mevcutyil-hireYear<20 && mevcutyil-hireYear>9 ) {
        toplamaas=salary*1.1;
    }

    else {
    	toplamaas=salary*1.15;
    }

    eklenecekzam=toplamaas-salary;
    return eklenecekzam;

}

public String toString() {
    return " Isimi: "+name+"\n Maasi: "+salary+"\n Haftalik calisma saati/sure: "+workHours+"\n Ise baslama yili: "+hireYear+"\n Vergi: "+ tax()+"\n Bonus:"+ bonus()+"\n Calisana Eklenecek Zam: "+raiseSalary()+"\n Calisanin Vergi+bonus Maasi: "+(salary-tax()+bonus())+"\n Calisanin Toplam Maasi: "+ (salary-tax()+bonus()+raiseSalary()) ;
}

 

public static void main(String[] args) {
	  Employee employe= new Employee();


	  	employe.bonus();
        employe.raiseSalary();
        employe.tax();
        String employeStr= employe.toString();
        System.out.println(employeStr);


    }


}
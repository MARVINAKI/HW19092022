import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Exercise 1,2,3
        var dog=8;
        var cat=3.6;
        var paper=763789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            System.out.println();
                dog+=4;
                cat+=4;
                paper+=4;
                System.out.print(dog+"\n"+cat+"\n"+paper+"\n");
                System.out.println();
                    dog-=3.5;
                    cat-=1.6;
                    paper-=7639;
                    System.out.println(dog+"\n"+cat+"\n"+paper);
                    System.out.println();

        //Exercise 4, 5
        var friend=19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend/=7;
        System.out.println(friend);
        System.out.println();
            var frog=3.5;
            System.out.println(frog);
            frog*=10;
            System.out.println(frog);
            frog/=3.5;
            System.out.println(frog);
            frog+=4;
            System.out.println(frog);
            System.out.println();

        //Exercise 6,7,8
        var boxerOneWeight=78.2;
        var boxerTwoWeight=82.7;
        var totalWeight=boxerOneWeight + boxerTwoWeight;
        var weightDifference=Math.abs(boxerOneWeight - boxerTwoWeight);
        System.out.println("Общий вес бойцов: " + totalWeight + " кг!");
        System.out.println("Разница в весе составляет: " + weightDifference + " кг!");
        System.out.println();

        var weightDifference1=boxerTwoWeight-boxerOneWeight;
        var weightDifference2=boxerTwoWeight%boxerOneWeight;
        System.out.println("Результат вычитания из большего меньшего: " + weightDifference1);
        System.out.println("Результат деления с остатком: " + weightDifference2);
        System.out.println();

        var totalHours=640;
        var oneWorkerHours=8;
        var amountWorker=totalHours/oneWorkerHours;
        System.out.println("Всего работников в компании - " + amountWorker + " человек");
        System.out.println();
        var amountWorkerAfter=amountWorker+94;
        var totalHoursNeed=amountWorkerAfter*oneWorkerHours;
        System.out.println("Если в компании работает " + amountWorkerAfter + " человек, то всего " + "\n" +
                            totalHoursNeed + " часов работы может быть поделено между сотрудниками");




    }
}
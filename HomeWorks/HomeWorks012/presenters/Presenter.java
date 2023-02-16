package HomeWorks.HomeWorks012.presenters;

import java.util.Scanner;

import HomeWorks.HomeWorks012.models.Animal;
import HomeWorks.HomeWorks012.models.Cat;
import HomeWorks.HomeWorks012.models.Checken;
import HomeWorks.HomeWorks012.models.Dog;
import HomeWorks.HomeWorks012.models.Stork;
import HomeWorks.HomeWorks012.models.Tiger;
import HomeWorks.HomeWorks012.models.Wolf;
import HomeWorks.HomeWorks012.models.Zoo;
import HomeWorks.HomeWorks012.views.View;

public class Presenter {
    private View view;
    private Zoo zoo;

public Presenter(View view, Zoo zoo) {
    this.view = view;
    this.zoo = zoo;
    }

    public void Open() {
        boolean flag = true;
        while (flag == true) {
            Scanner iScanner = new Scanner(System.in);
            this.view.Menu();
            int menu = iScanner.nextInt();
            if (menu == 1) {
                Animal animal = choiseAnimal();
                this.zoo.addAnimal(animal);
            }
            else if (menu == 2) this.zoo.removeAnimal(getAnimal());
            else if (menu == 3) this.view.PrintAnimal(this.zoo.getAnimal(getAnimal()));
            else if (menu == 4) this.view.SoundAnimal(this.zoo.getAnimal(getAnimal()));
            else if (menu == 5) this.view.PrintAnimals(this.zoo.getAnimals());
            else if (menu == 6) this.view.SoundAnimals(this.zoo.getAnimals());
            else flag = false;
            // iScanner.close();
        }
    }

    public int getAnimal() {
        this.view.ChoiseAnimalMsg();
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        if (!(num >= this.zoo.getAnimals().size()) && !(num < 0)) {
            return num;
        } else {
            this.view.BadIndex();
            return 0;
        }
        

    }
    
    private Animal choiseAnimal() {
        this.view.ChoiseAddAnimalMsg();
        Scanner iScanner = new Scanner(System.in);
        int choiseAnimal = iScanner.nextInt();
        
        iScanner = new Scanner(System.in);
        String[] result;
        if (choiseAnimal == 1) {
            this.view.ChoiseAnimal1Msg();
            result = iScanner.nextLine().split(" ");

            return new Cat(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], result[3], result[4], result[5], result[6], result[7], Boolean.parseBoolean(result[8]));
        }
        else if (choiseAnimal == 2) {
            this.view.ChoiseAnimal2Msg();
            result = iScanner.nextLine().split(" ");

            return new Dog(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], result[3], result[4], result[5], result[6], result[7], Boolean.parseBoolean(result[8]));

        }
        else if (choiseAnimal == 3) {
            this.view.ChoiseAnimal3Msg();
            result = iScanner.nextLine().split(" ");

            return new Tiger(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], result[3], result[4]);

        }

        else if (choiseAnimal == 4) {
            this.view.ChoiseAnimal4Msg();
            result = iScanner.nextLine().split(" ");

            return new Wolf(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], result[3], result[4], Boolean.parseBoolean(result[5]));

        }

        else if (choiseAnimal == 5) {
            this.view.ChoiseAnimal5Msg();
            result = iScanner.nextLine().split(" ");

            return new Checken(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], Integer.parseInt(result[3]));

        }

        else if (choiseAnimal == 6) {
            this.view.ChoiseAnimal6Msg();
            result = iScanner.nextLine().split(" ");

            return new Stork(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], Integer.parseInt(result[3]));
        }
        else {
            this.view.BadIndex();
            return null;
        }

        }

}

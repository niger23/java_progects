// 2.1.Транспортное средство
// 2.2.Автомобиль
// 2.3.Мотоцикл
// 2.4.Грузовик
// 2.5.Велосипед
// Во всех классах должны быть написаны: цвет, модель, 
// количество колёс, вес и скорость а так же метод ехать.
// В классе Program реализовать метод который будет 
// работать с любым наследником класса ровно так же как 
// и с родителем, то есть показать значение всех его 
// публичных свойств и вызвать метод ехать.

package Seminars.Seminar007.ex001;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Transports item1 = new Auto();
        item1.model = "Tesla";
        item1.color = "grey";
        Transports item2 = new Bike();
        item2.model = "Suzuki";
        item2.color = "black";
        Transports item3 = new Truck();
        item3.model = "Man";
        item3.color = "green";
        Transports item4 = new Bicycle();
        item4.model = "Kama";
        item4.color = "white";
        
        List<Transports> transports = new ArrayList<>();
        transports.add(item1); transports.add(item2); transports.add(item3); transports.add(item4);
        drive(transports);
    }
    private static void drive(List<Transports> transports) {
        for (Transports transport : transports) {
            System.out.println(transport.transInfo());
            System.out.println(transport.goMove(10));
    }
}

}

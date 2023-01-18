//
//        Для всех полей должны быть реализованы сеттеры, а для поля fuel еще и геттер.
//
//        Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса (значение поля “количество топлива в баке” установить равным 0). В конструкторе для передачи полям значений использовать ключевое слово this. Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
//        “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
//
//        Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и дозаправляет топливный бак самолета на это значение.
//        Создать новый объект класса Самолет с произвольными данными.
//        Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза, передав разные значения. Вызвать метод info().
//

package day6;

public class Airplane {
   private String manufactured;
   private int year;
   private int length;
   private int weigth;
   private int fuel;

        public void setManufactured(String manufactured) { this.manufactured = manufactured;   }
        public void setYear(int year) {                this.year = year;        }
        public void setLength(int length) {                this.length = length;        }
        public void setWeigth(int weigth) {                this.weigth = weigth;        }
        public void setFuel(int fuel) {                this.fuel = fuel;        }
        public int getFuel() {                return fuel;        }

    public Airplane(String manufactured, int year, int length, int weigth) {
        this.manufactured = manufactured;
        this.year = year;
        this.length = length;
        this.weigth = weigth;
        this.fuel=0;
    }
    public void info() {
        System.out.println("Изготовитель: "+this.manufactured+", год выпуска: "+this.year+", длина: "+this.length+", вес: "+this.weigth + ", количество топлива в баке: "+this.fuel);
    }
    public void fillUp(int n) {this.fuel= this.fuel+n;}
}

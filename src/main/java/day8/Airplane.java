package day8;

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
    public static void compareAirplanes(Airplane  airplane1,Airplane airplane2)
    {
        if (airplane1.length==airplane2.length) System.out.println("Длины самолетов равны");
         else
             if (airplane1.length> airplane2.length) System.out.println("Первый самолет длиннее");
                 else System.out.println("Второй самолет длиннее");
    }
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
       return stringBuilder.append("Изготовитель: ").append(manufactured).append(", год выпуска: ").append(year).append(", длина: ").append(length).append(", вес: ").append(weigth).append(", количество топлива в баке: ").append(fuel).toString();
    }


}

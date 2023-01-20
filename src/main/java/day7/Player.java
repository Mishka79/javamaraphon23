package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA=100;
    public static final int MIN_STAMINA=0;
    public static int countPlayers=0;

    public int getStamina() {        return stamina;    }
    public static int getCountPlayers() {        return countPlayers;    }

    public Player(int stamina) {

        if (countPlayers<6) {
            countPlayers++;
            this.stamina = stamina;
        }
    }
    public void run()
    {
       if (this.stamina==1) {this.stamina--;countPlayers--;}
       if (this.stamina>1) this.stamina--;

    }
    public static void info()
    {
        if (countPlayers>5) System.out.println("На поле нет свободных мест");
         else System.out.println("Команды не полные. На поле еще есть "+(6-countPlayers)+" свободных мест");
    }
}

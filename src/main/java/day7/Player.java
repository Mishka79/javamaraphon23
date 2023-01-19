package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA=100;
    public static final int MIN_STAMINA=0;
    public static int countPlayer=0;

    public int getStamina() {        return stamina;    }
    public static int getCountPlayers() {        return countPlayer;    }

    public Player(int stamina) {

        if (countPlayer<6) {
            countPlayer++;
            this.stamina = stamina;
        }
    }
    public void run()
    {
       if (this.stamina==1) {this.stamina--;countPlayer--;}
       if (this.stamina>1) this.stamina--;

    }
    public static void info()
    {
        if (countPlayer>5) System.out.println("На поле нет свободных мест");
         else System.out.println("Команды не полные. На поле еще есть "+(6-countPlayer)+" свободных мест");
    }
}

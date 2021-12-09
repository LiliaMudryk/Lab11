package atm;

public class ATM {
    private Tray startTray;
    public ATM() {
        Tray tray20 = new Tray20();
        Tray tray10 = new Tray10();
        Tray tray5 = new Tray5();
        tray20.setNextTray(tray10);
        tray10.setNextTray(tray5);
        startTray = tray20;
    }
    public void process(int amount){
        startTray.process(amount);
    }
}

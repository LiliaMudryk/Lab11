package atm;

public interface Tray {
    void process(int amount);
    void setNextTray(Tray tray);
}

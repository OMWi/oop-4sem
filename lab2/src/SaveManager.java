public class SaveManager {
    private Save save;
    public SaveManager(Save save) {
        this.save = save;
    }
    public Save getMemento() {
        return save;
    }
    public void setMemento(Save save) {
        this.save = save;
    }
}

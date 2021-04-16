public class Recruiting {
    public static void main(String[] args) {
        Unit army1 = new Squad();
        Unit army2 = new Squad();
        recruitArmy1(army1);
        recruitArmy2(army2);

        System.out.println("Power of first army:" + army1.getStrength());
        System.out.println("Power of second army:" + army2.getStrength());
    }

    static void recruitArmy1(Unit army) {
        Unit elves = new Squad();
        for (int i = 0; i < 400; i++) {
            elves.add(new Elf());
        }
        Unit knights = new Squad();
        for (int i = 0; i < 1200; i++) {
            knights.add(new Knight());
        }
        Unit centaurs = new Squad();
        for (int i = 0; i < 150; i++) {
            centaurs.add(new Centaur());
        }
        army.add(elves);
        army.add(knights);
        army.add(centaurs);
        army.add(new Dragon());
    }

    static void recruitArmy2(Unit army) {
        Unit orcs = new Squad();
        for (int i = 0; i < 600; i++) {
            orcs.add(new Orc());
        }
        Unit cyclops = new Squad();
        for (int i = 0; i < 20; i++) {
            cyclops.add(new Cyclop());
        }
        Unit minotaurs = new Squad();
        for (int i = 0; i < 6; i++) {
            minotaurs.add(new Minotaur());
        }
        army.add(orcs);
        army.add(cyclops);
        army.add(minotaurs);
        army.add(new Hydra());
    }
}

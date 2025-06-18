public  class Fool extends Character implements Human {

    public void attack(Matango m) {
        System.out.println(this.name + "は戦わずに遊んでいる");
    }

    public void talk(Matango m) {
        System.out.println(this.name + "は意味のないことを話した。");
    }

    public void watch(Matango m) {
        System.out.println(this.name + "は虚空を見つめている。");
    }

    public void hear(Matango m) {
        System.out.println(this.name + "は誰かの声を聞いた気がした。");
    }

    public void run(Matango m) {
        System.out.println(this.name + "は大笑いしながら逃げ出した。");
    }

    @Override
    public void run(){

    }

    @Override
    public void talk() {

    }

    @Override
    public void watch() {

    }

    @Override
    public void hear() {

    }
}

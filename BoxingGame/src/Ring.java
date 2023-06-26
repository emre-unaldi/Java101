public class Ring {
    private Fighter fighterOne;
    private Fighter fighterTwo;
    Integer minWeight;
    Integer maxWeight;

    public Ring(Fighter fighterOne, Fighter fighterTwo, Integer minWeight, Integer maxWeight) {
        this.fighterOne = fighterOne;
        this.fighterTwo = fighterTwo;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public Fighter getFighterOne() {
        return fighterOne;
    }

    public void setFighterOne(Fighter fighterOne) {
        this.fighterOne = fighterOne;
    }

    public Fighter getFighterTwo() {
        return fighterTwo;
    }

    public void setFighterTwo(Fighter fighterTwo) {
        this.fighterTwo = fighterTwo;
    }

    public Integer getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Integer minWeight) {
        this.minWeight = minWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (this.getFighterOne().getHealth() > 0 && this.getFighterTwo().getHealth() > 0) {
                System.out.println("======== YENİ ROUND ===========");
                this.getFighterTwo().setHealth(this.getFighterOne().hit(this.getFighterTwo()));
                if (isWin()){
                    break;
                }
                this.getFighterOne().setHealth(this.getFighterTwo().hit(this.getFighterOne()));
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (this.getFighterOne().getWeight() >= this.getMinWeight() &&
                        this.getFighterOne().getWeight() <= this.getMaxWeight()) &&
                (this.getFighterTwo().getWeight() >= this.getMinWeight()
                        && this.getFighterTwo().getWeight() <= this.getMaxWeight());
    }

    public boolean isWin() {
        if (this.getFighterOne().getHealth() == 0) {
            System.out.println("Maçı Kazanan : " + this.getFighterTwo().getName());
            return true;
        } else if (this.getFighterTwo().getHealth() == 0){
            System.out.println("Maçı Kazanan : " + this.getFighterOne().getName());
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(this.getFighterOne().getName() + " Kalan Can \t:" + this.getFighterOne().getHealth());
        System.out.println(this.getFighterTwo().getName() + " Kalan Can \t:" + this.getFighterTwo().getHealth());
    }
}

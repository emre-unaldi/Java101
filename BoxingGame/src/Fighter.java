public class Fighter {
    private String name;
    private Integer damage;
    private Integer health;
    private Integer weight;
    private Double dodge;

    public Fighter(String name, Integer damage, Integer health, Integer weight, Double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getDodge() {
        return dodge;
    }

    public void setDodge(Double dodge) {
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("===============================================");
        System.out.println(this.getName() + " => " + foe.getName() + " " +  this.getDamage() + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.getName() + " gelen hasarı savurdu.");
            return foe.getHealth();
        }

        if (foe.getHealth() - this.getDamage() < 0)
            return 0;

        return foe.getHealth() - this.getDamage();
    }

    public boolean dodge() {
        Double randomValue = Math.random() * 100;
        return randomValue <= this.getDodge();
    }
}

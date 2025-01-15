class Employees {
    private String name;
    private int id;

    Employees(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}

class Manager extends Employees {
    private int teamSize;

    Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
    }
}

class Engineer extends Employees {
    private String specialization;

    Engineer(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization : " + specialization);
    }
}


class inhertance {
    public static void main(String[] args) {
        Engineer e1 = new Engineer("William", 202, "Backend Engineer");
        Manager m1 = new Manager("Jax", 101, 8);

        m1.displayDetails();
        e1.displayDetails();
    }
}
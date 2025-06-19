

public class Parent {
    private String name;
    private int age;
    private String address;

    public double netWorth(){
        double netWorthOfCars = 400.90;
        double netWorthOfHouses = 784693.937;
        double netWorthOfCompany = 999999292.82;
        return netWorthOfCars + netWorthOfHouses + netWorthOfCompany;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.name = "mazi okeke";
        parent.age = 54;
        parent.address = "123 Main St";
        System.out.println(parent);
        System.out.println(parent.netWorth());

        Parent parent2 = new Parent();
        parent2.name = "odogwu ogb";
        parent2.age = 49;
        parent2.address = "123 Main St";
        System.out.println(parent2);
        System.out.println(parent2.netWorth());

    }
}

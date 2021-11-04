package Tests.Parcels.PArcel10.Е1;

public class E1 {
    CollectField collectField(String name, float peice){
        int cost;
        String name0 = name;
        {

            cost = Math.round(peice);
            if (cost>100) System.out.println("more then need");
            else System.out.println(cost);
        }

        return new CollectField() {
            @Override
            public String nameTown() {
                return name0;
            }

            @Override
            public float cost() {
                return cost;
            }
        };
    }

    public static void main(String[] args) {
        CollectField cf = new E1().collectField("Odessa", 25.23F);
    }
}

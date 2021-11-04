package Tests.Parcels.Interfaces.TwoWays;

public class Testing_the_method2 {
    FirstIn f1 = new FirstIn() {
        @Override
        public void intOne() {

        }
    };
    SrcondIn s1 = new SrcondIn() {
        @Override
        public int intTwo() {
            return 0;
        }
    };
}

package Tests.Parcels.Interfaces.TwoWays;

public class Testing_the_method3 {
    FirstIn makeF1(){
        return new FirstIn() {
            @Override
            public void intOne() {

            }
        };
    }
    SrcondIn s2(){
        return new SrcondIn() {
            @Override
            public int intTwo() {
                return 0;
            }
        };
    }
}

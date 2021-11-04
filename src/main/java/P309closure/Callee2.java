package P309closure;

class Callee2 extends MyIncrement{
    private int i =0;

    @Override
    public MyIncrement increment() {
        super.increment();
        i++;
        System.out.println(i);
        return null;
    }
    private class Closure implements Incrementable{

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}
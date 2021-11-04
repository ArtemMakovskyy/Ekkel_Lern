package P309closure;

class Caller{
    private Incrementable callbackReference;

    public Caller(Incrementable callbackReference) {
        this.callbackReference = callbackReference;
    }
    void go(){
        callbackReference.increment();
    }

}
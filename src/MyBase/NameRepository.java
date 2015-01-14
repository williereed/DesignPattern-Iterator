package MyBase;

public class NameRepository implements IContainer {
    private String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public IIterator createIterator() {
        return new NameIterator();
    }

    private class NameIterator implements IIterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
package MyBase;

public class Main {

    public static void main(String[] args) {

        NameRepository namesRepository = new NameRepository();

        for(IIterator iterator = namesRepository.createIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }

    }
}

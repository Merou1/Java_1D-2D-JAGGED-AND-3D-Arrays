public class Dog extends Animal{
    private String name;

    Dog(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(super.getName()+" is eating");
    }

}

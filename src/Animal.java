public abstract class Animal {
    protected String name;

    Animal(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public abstract void  eat();

}

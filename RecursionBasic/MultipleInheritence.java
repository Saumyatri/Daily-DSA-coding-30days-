public class MultipleInheritence{
    public static void main(String args[]){
        Bear b = new Bear();
        b.Nonvegeats();
        b.Vegeats();
    }

}

interface Herbivore{
    void Vegeats();
}

interface Carnivore{
    void Nonvegeats();

}
class Bear implements Carnivore,Herbivore{
    public void Nonvegeats(){
        System.out.println("Eats Meat");
    }

    public void Vegeats(){
        System.out.println("Eats Leaves");
    }
}
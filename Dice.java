public class Dice {
    int[] diceThrown;
Die die=new Die();

    public int getValue(int newValue)
    {
        return this.diceThrown[newValue];
    }
    public void prepCup(int newValue){
    diceThrown=new int[newValue];
    }

    public void resolveDie(){
        for (int i = 0; i < diceThrown.length; i++ )
        {
            die.roll();
            diceThrown[i]=die.getValue();

        }
    }
    public void throwCup(int newValue){
        prepCup(newValue);
        resolveDie();
    }
}

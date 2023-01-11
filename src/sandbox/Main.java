package sandbox;

public class Main {
    public static void main(String[] args){
        Sandbox firstRef = new Sandbox();
        System.out.println(firstRef.letter);
        //Should print sandbox.Sandbox@MEMORY_KEY
        firstRef.letter = "a";
        Sandbox secondRed = firstRef;
        secondRed.letter = "b";
        if(firstRef == secondRed){
            System.out.println(firstRef + " = " + secondRed);
        }
        System.out.println(firstRef.letter);
    }
}

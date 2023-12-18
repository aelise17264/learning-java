package OOP;
import java.util.ArrayList;

public class ModArrayList<D> extends ArrayList<Integer>{
    public D getUsingMod(int index){
        int validIndex = Math.abs(index) % this.size();
        return (D) this.get(validIndex);
    }
}

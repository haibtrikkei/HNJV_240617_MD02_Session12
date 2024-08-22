import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCapacity {
    int capacity = 100;
    private ArrayList<Integer> list = new ArrayList<>(capacity);


    public void test(){
        list.ensureCapacity(200);

    }
}

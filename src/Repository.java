import java.util.HashMap;
import java.util.Map;

public class Repository {
    public static Repository instance = null;

    public Map<Long, Customer> map;

    private Repository() {
        map = new HashMap<Long, Customer>();
    }

    public static synchronized Repository getInstance(){
        if(instance == null){
            instance = new Repository();
        }
        return instance;
    }
}

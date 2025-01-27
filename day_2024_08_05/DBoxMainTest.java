package day_2024_08_05;

class DBox<L,R>{
    private L str;
    private R count;

    public void set(L str, R count){
        this.str = str;
        this.count = count;
    }

    @Override
    public String toString(){
        return str + " , " + count;
    }
}

public class DBoxMainTest {
    public static void main(String[] args) {
        
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box); // Apple & 25개
    }
}

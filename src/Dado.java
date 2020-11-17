
import java.util.concurrent.atomic.AtomicLong;


public class Dado{

        AtomicLong n1 = new AtomicLong(0);
        AtomicLong n2 = new AtomicLong(0);
        AtomicLong n3 = new AtomicLong(0);
        AtomicLong n4 = new AtomicLong(0);
        AtomicLong n5 = new AtomicLong(0);
        AtomicLong n6 = new AtomicLong(0);
        AtomicLong[] dado = {n1,n2,n3,n4,n5,n6};
        AtomicLong total = new AtomicLong(0);


    protected void suma(int tirada){
        dado[tirada].addAndGet(1);
        total.addAndGet(1);
    }



}

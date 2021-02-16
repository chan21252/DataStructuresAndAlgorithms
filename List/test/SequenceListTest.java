import com.chan.list.SequenceList;
import org.junit.Test;

/**
 * SequenceListTest
 */
public class SequenceListTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        SequenceList list = new SequenceList(a, 5);
        list.traverse();
        list.insert(6, 5);
        list.traverse();
        list.insert(18, 2);
        list.traverse();
        list.insert(0, 0);
        list.traverse();
        System.out.println("顺序表长度：" + list.length());
        list.remove(7);
        list.traverse();
    }
}

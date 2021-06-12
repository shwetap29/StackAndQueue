import com.bridgelabz.INode;
import com.bridgelabz.MyNode;
import com.bridgelabz.Stack;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void IfStackIsCreated_shouldReturnTrue() {
        Stack<Integer> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        stack.push(myThirdNode);
        stack.push(mySecondNode);
        stack.push(myFirstNode);
        INode peek = stack.peek();
        Assert.assertEquals(peek, myFirstNode);
    }

    @Test
    public void IfStackPopOrPeek_ShouldReturnTrue() {
        Stack<Integer> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        stack.push(myThirdNode);
        stack.push(mySecondNode);
        stack.push(myFirstNode);
        INode popStack = stack.pop();
        Assert.assertEquals(popStack, myFirstNode);
    }
}

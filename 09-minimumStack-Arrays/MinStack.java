import java.util.ArrayList;
import java.util.Stack;

public class MinStack
{
  ArrayList<Integer> stack = new ArrayList<>();
  ArrayList<Integer> minStack = new ArrayList<>();

  public MinStack()
  {
   this.stack = stack;
   this.minStack = minStack;
  }

  /**
   * Pushes the value specified onto the stack
   *
   * @param val - value to be pushed
   */
  public void push(int val)
  {
    this.stack.add(val);
    int min = this.minStack.get(0);

    if (!this.minStack.isEmpty())
    {

    }
  }

  /**
   * Removes the element at the top of the stack
   */
  public void pop()
  {
    this.stack.remove(this.stack.size()-1);
  }

  /**
   * Gets the top element in the stack
   * @return - the top element in the stack
   */
  public int top()
  {

  }

  /**
   * Gets the minimum element in the stack
   * @return - the minimum element in the stack
   */
  public int getMin()
  {

  }
}

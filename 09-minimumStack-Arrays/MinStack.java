class Node
{
  int val;
  Node next;
  Node prev;
  int min;

  Node()
  {
  }

  Node(int val)
  {
    this.val = val;
  }
}


class MinStack
{
  Node tail;
  Node topNode = tail;
  Node minimumNode = tail;

  public MinStack()
  {
  }

  public void push(int val)
  {
    Node nodeToAdd = new Node(val);

    if (topNode == null)
    {
      tail = nodeToAdd;
      minimumNode = nodeToAdd;
      nodeToAdd.min = nodeToAdd.val;
    }
    else
    {
      if (nodeToAdd.val < minimumNode.val)
      {
        minimumNode = nodeToAdd;
      }

      topNode.prev = nodeToAdd;
      nodeToAdd.next = topNode;

    }


    topNode = nodeToAdd;
  }

  public void pop()
  {
    boolean needToUpdateMin = false;

    if (topNode == minimumNode)
    {
      needToUpdateMin = true;
    }
    if (topNode.next != null)
    {
      topNode = topNode.next;
      topNode.prev = null;
    }
    else
    {
      topNode = null;
      tail = null;
    }

    if (needToUpdateMin)
    {
      updateMinimumNode();
    }
  }

  private void updateMinimumNode()
  {
    Node iterationNode = topNode;
    minimumNode = iterationNode;

    while (iterationNode != null)
    {
      if (iterationNode.val < minimumNode.val)
      {
        minimumNode = iterationNode;
      }

      iterationNode = iterationNode.next;
    }


  }

  public int top()
  {
    return topNode.val;
  }

  public int getMin()
  {

    System.out.println("minimum: " + minimumNode.val);
    return minimumNode.val;
  }
}

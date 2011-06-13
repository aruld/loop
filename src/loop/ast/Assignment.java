package loop.ast;

import loop.Parser;

/**
 * A right to left assignment statement.
 */
public class Assignment extends Node {
  private final Node condition;
  public Assignment(Node condition) {
    this.condition = condition;
  }

  public Assignment() {
    this(null);
  }

  private Node lhs() {
    return children.get(0);
  }

  private Node rhs() {
    return children.get(1);
  }

  @Override
  public String toSymbol() {
    if (condition == null) {
      return "=";
    }
    return "=if" + Parser.stringify(condition);
  }
}

package parenthesis

import org.scalatest.FunSuite

/**
 * Created by sai on 14/06/2015.
 */
class ParenthesisBalancerTest extends FunSuite {

  test("parenthesis balanced") {

    assert(ParenthesisBalancer.balance("()".toList) == true)

  }

  test("parenthesis balanced nested") {

    assert(ParenthesisBalancer.balance("(a + b (c * d))".toList) == true)

  }

  test("parenthesis unbalanced simple") {

    assert(ParenthesisBalancer.balance(")".toList) == false)

  }

  test("parenthesis unbalanced nested") {

    assert(ParenthesisBalancer.balance("(a + b (c * d)".toList) == false)

  }
  test("parenthesis unbalanced out of sequence") {

    assert(ParenthesisBalancer.balance("(a + b (c * d))(".toList) == false)

  }

}

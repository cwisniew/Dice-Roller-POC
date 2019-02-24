package net.rptools.maptool.dice.expressiontree;

import net.rptools.maptool.dice.result.DiceExprResult;
import net.rptools.maptool.dice.symbols.DiceExpressionSymbolTable;

import java.util.Collection;
import java.util.Collections;

/**
 * Note which represents a value expression
 */
public class ValueDiceExpressionNode implements DiceExpressionNode {

    /** The value that this object represents. */
    final private DiceExprResult value;

    /**
     * Creates an integer value.
     * @param value the integer.
     */
    public ValueDiceExpressionNode(int value) {
        this.value = DiceExprResult.getIntResult(value);
    }

    /**
     * Creates a double value.
     * @param value the doulbe.
     */
    public ValueDiceExpressionNode(double value) {
        this.value = DiceExprResult.getDoubleResult(value);
    }

    /**
     * Creates a String value.
     * @param value the String.
     */
    public ValueDiceExpressionNode(String value) {
        this.value = DiceExprResult.getStringResult(value);
    }



    @Override
    public DiceExprResult evaluate(DiceExpressionSymbolTable symbolTable) throws UnsupportedOperationException {
        return value;
    }

    @Override
    public DiceExprResult getExprResult() {
        return value;
    }

    @Override
    public Collection<DiceExpressionNode> getChildren() {
        return Collections.emptyList();
    }

}
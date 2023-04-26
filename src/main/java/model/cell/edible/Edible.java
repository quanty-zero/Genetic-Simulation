package model.cell.edible;

import model.cell.Cell;

/**
 * Interface Edible represents edible cells on simulation field.
 * Bot can eat edible cells by grabbing or stepping on and get related effect.
 */
public interface Edible extends Cell {
    /**
     * @return positive or negative number, which represents effect of eating cell
     */
    public int getEffect();
}

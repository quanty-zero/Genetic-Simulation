package model;


import model.cell.Bot;

/**
 * Interface Generation represents generation of bots.
 * Generation can be pure or have mutations.
 */
public interface Generation {
    /**
     * @return generation of bots
     */
    public Bot[] getGeneration();
}

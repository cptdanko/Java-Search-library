package au.edu.unsw.cse.jayen.bisearch;

import au.edu.unsw.cse.jayen.search.Heuristic;

/**
 * implements the uniform-cost search algorithm
 * 
 * @author jayen
 * 
 */
public class UniformCostSearch extends AStarSearch {
   public UniformCostSearch() {
      super(new Heuristic.Zero(), new Heuristic.Zero());
   }
}

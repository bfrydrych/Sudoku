package com.github.bfrydrych.planner;

import org.drools.planner.core.score.Score;
import org.drools.planner.core.solution.Solution;

public abstract class SolutionBridge implements Solution {
    public Score getScore() {
        return scalaGetScore();
    }

    public void setScore(Score score) {
    	scalaSetScore(score);
    }
    
    public abstract void scalaSetScore(Score<?> score);
    public abstract Score<?> scalaGetScore();
    
    
}
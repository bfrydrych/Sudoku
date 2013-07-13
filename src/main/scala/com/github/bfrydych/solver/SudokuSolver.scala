package com.github.bfrydych.solver

import java.util.Collection
import org.drools.planner.core.score.Score
import org.drools.planner.core.score.buildin.simple.SimpleScore
import com.github.bfrydrych.planner.SolutionBridge
import com.github.bfrydych.solver.domain.Column
import com.github.bfrydych.solver.domain.Digit
import com.github.bfrydych.solver.domain.Row
import com.github.bfrydych.solver.domain.Value
import org.drools.planner.api.domain.solution.PlanningEntityCollectionProperty

class SudokuSolver extends SolutionBridge{

    // Problem facts
    var columnList:List[Column] = List()
    var rowList:List[Row] = List()
    var valueList:List[Value] = List()

    // Planning entities
    @PlanningEntityCollectionProperty
    var digitList:List[Digit] = List()

    var score:SimpleScore = ???

    def scalaSetScore(score:Score[_]):Unit = {
      ???
    }
    
    def cloneSolution:SudokuSolver = {
      val clone:SudokuSolver = new SudokuSolver
        clone.columnList = columnList
        clone.rowList = rowList
        clone.valueList = valueList
        val clonedDigitList:List[Digit] = List()
        digitList.foreach(digit => clonedDigitList ::: List(digit.clone))
        clone.digitList = clonedDigitList
        clone.score = score
        clone
    }
  
    def getProblemFacts():Collection[AnyRef] = {
      ???
    }
    
    def scalaGetScore():Score[SimpleScore] = {
      ???
    }
    
}
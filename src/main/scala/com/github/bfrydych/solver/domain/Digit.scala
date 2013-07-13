package com.github.bfrydych.solver.domain

import org.drools.planner.api.domain.entity.PlanningEntity
import org.drools.planner.api.domain.variable.PlanningVariable
import org.drools.planner.api.domain.variable.ValueRange
import org.drools.planner.api.domain.variable.ValueRangeType

@PlanningEntity
class Digit {

  var column:Column = new Column()
  var row:Row  = new Row()
  
  @PlanningVariable
  @ValueRange(`type` = ValueRangeType.FROM_PLANNING_ENTITY_PROPERTY, planningEntityProperty = "possibleValue")
  var value:Value = new Value()
  
  override def clone:Digit = {
    val clone = new Digit
    clone.column = column
    clone.row = row
    clone.value = value
    clone
  }
}
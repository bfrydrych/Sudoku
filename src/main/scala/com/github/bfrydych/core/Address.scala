package com.github.bfrydych.core

class Address(val row:Int, val column:Int, val stone:Boolean = false) {
	override def equals(o: Any):Boolean = {
	  val addr = o.asInstanceOf[Address]
	  val rowEq = addr.row.equals(row)
	  val colEq = addr.column.equals(column)
	  if(rowEq && colEq) {
	    return true
	  }
	  return false
   }
	
	override def hashCode():Int = {
	  row.hashCode + column.hashCode
	}
}
package com.github.bfrydych.core

import scala.collection.mutable.Map
import scala.collection.mutable.HashMap
import com.github.bfrydych._

class Board(val size:Int) {
  val board:Map[Address, Int] = new HashMap;
  
  def generateEmptyBoard {
    iterate((i:Int, j:Int) => board.put(new Address(i, j), 0))
  }
  
   def eachField(f:(Address, Int) => Unit) {
     iterate((i:Int, j:Int) => f(new Address(i, j), board.get(new Address(i, j)).get))
   }
   
   def set(address:Address, value:Int) {
     if (!address.stone) board.put(address, value)
   }
   
   def validate:Boolean = {
     return board.forall(address => validateField(address._1))
   }
   
   def validateField(address:Address):Boolean = {
    def rowIteration(row:Int, address:Address):Boolean = {
      val iterAddress = new Address(row, address.column)
      if (!iterAddress.equals(address)) {
         return board.get(iterAddress).get != board.get(address).get
      }
      return true
    }
    def columnIteration(column:Int, address:Address):Boolean = {
      val iterAddress = new Address(address.row, column)
      if (!iterAddress.equals(address)) {
         return board.get(iterAddress).get != board.get(address).get
      }
      return true
    }
    
    val columnRange = 1 to size by 1
    val validColumn = columnRange.forall(column => columnIteration(column, address))
    
    val rowRange = 1 to size by 1
    val validRow = rowRange.forall(row => rowIteration(row, address))
    
    return validColumn && validRow
   }
   
   
   private def iterate(f:(Int, Int) => Unit) {
     def inerIter(i:Int) {
      (1 to size) foreach (j => f(i, j))
    }
    val range = 1 to size by 1
    range.foreach(i => inerIter(i))
   }
}

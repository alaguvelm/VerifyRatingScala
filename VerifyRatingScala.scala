class VerifyRating {
   var teamName:String ="";
   var played:Int=0;
   var won:Int=0;
   var drawn:Int=0;
   var lost:Int=0;
  
  def setTeamName(teamName:String): Unit = this.teamName = teamName;
  
  def setPlayed (played:Int): Unit = this.played = played;

  def setWon(won:Int): Unit = this.won = won;

  def setDrawn(drawn:Int): Unit = this.drawn = drawn;

  def setLost(lost:Int): Unit = this.lost = lost;
   
  def rating = {
      var value = ((10000f*(won*3+drawn))/(3*played))/100;
      Math.round(value);
  }
}
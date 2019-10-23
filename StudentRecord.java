public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
  
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   private double average(int first, int last)
   {   int n = 0;
       double sum = 0;
       for (int i =0; i < scores.length; i++)
       {
           sum += scores[i];
           n+=1;
       }
       return sum/n; //here so the class compiles
   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   private boolean hasImproved()
   {
      for (int i = 0; i < scores.length; i++)
      {
          if (scores[i] < scores[i+1])
          return true;
          else
          return false;
      }  
      return false; //here so the class compiles
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {  int half = scores.length/2;
      double sum = 0;
      int n = 0;
      boolean Improved = false;
      if (Improved = false) {
      for (int i = 0; i < scores.length; i++)
      { 
          sum += scores[i];
          n+=1;
      }
      //here so the class compiles
     } else if (Improved = true) {
      for (int i =0; i < half; i++)
      {
          sum += scores[half+i];
          n+=1;
      }
     }
     return sum/n;
    } 
}
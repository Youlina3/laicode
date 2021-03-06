//Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), 
//determine if a person could attend all meetings.

//For example,
//Given [[0, 30],[5, 10],[15, 20]],
//return false.



// My solution
//
public class Solution {
  public boolean canAttendMeetings(int[][] intervals) {
    if (intervals == null || intervals.length == 0) {
      return false;
    }
    
    Arrays.sort(intervals, new Comparator<int[]>(){
      @Override
      public int compare(int[] array1, int[] array2) {
        if (array1[0] == array2[0]) {
          return 0;
        }
        return array1[0] > array2[0] ? 1 : -1;
      }
    });
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i-1][1] > intervals[i][0]) {
        return false;
      }      
    }
    
    return true;
  }
}






import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {


    public List<List<Integer>> generate(int numRows) {
        int target_rofR = numRows+2;
        Integer topTriangle = 1;
        List<Integer> triangleRow = new ArrayList<>();
        List<List<Integer>> rowsofRows = new ArrayList<>();
        //initialize peak
        triangleRow.add(0, topTriangle);
        rowsofRows.add(0, triangleRow);
        int triangleRowsindex = 0;
        int rowsofRowsindex = 0;

        for (int nmrs = 1; nmrs < numRows+2; nmrs++) {
            if (nmrs < 2) {
                triangleRow = new ArrayList<>();
                triangleRow.add(topTriangle);
                triangleRowsindex++;
                triangleRow.add(topTriangle);
                triangleRowsindex++;
                //  triangleRow.add(1);
                rowsofRows.add(1, triangleRow);
                rowsofRowsindex = 2;
            }

            if (nmrs == 2) {
                //   for (int i = 2; i = numRows; i++) {
                triangleRowsindex = 0;
                triangleRow = new ArrayList<>();
                triangleRow.add(triangleRowsindex, topTriangle);
                triangleRowsindex++;
                Integer twww0 = 2;
                triangleRow.add(triangleRowsindex, twww0);
                triangleRowsindex++;
                triangleRow.add(triangleRowsindex, topTriangle);
                rowsofRows.add(rowsofRowsindex, triangleRow);
                rowsofRowsindex++;
            }

            if (target_rofR>nmrs && nmrs > 2) {
                int n = 0;
                int i;
                try {
                    triangleRow = new ArrayList<>();
                         triangleRowsindex = 0;

              //  triangleRowsindex = 0;
                    for ( i= 3; i < ( target_rofR); i++) {
                   //     triangleRow = new ArrayList<>();                   ///TODO so close! all triangleRows 3+ have 5 members, need to put right
                   //     triangleRowsindex = 0;                                    //TODO digits in inner topTriangles
                  //      for (int p = numRows; p > 0; p--) {
                            triangleRow.add(triangleRowsindex, topTriangle);
                            triangleRowsindex++;
                //        }
                    }n++;
                        rowsofRows.add(rowsofRowsindex, triangleRow);
                        rowsofRowsindex++;
                 //   }n++;
                    target_rofR++;
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                    break;
                }
               // nmrs =  target_rofR;

            } }

       return rowsofRows;
    }
}




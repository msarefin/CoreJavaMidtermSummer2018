package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        pyramid("*", 6);

        }

        static void pyramid(String c, int height){

            for(int i = 0; i<height+1; i++){
                for(int j = 0; j<height-i; j++){
                    System.out.print(" ");
                }

                for(int j = 0; j<i; j++){
                    System.out.print(c+" ");
                }
                System.out.println();
            }



        }

  }

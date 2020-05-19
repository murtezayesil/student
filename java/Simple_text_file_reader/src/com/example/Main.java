//         _                 _         _            _       __ _ _                            _
//     ___(_)_ __ ___  _ __ | | ___   | |_ _____  _| |_    / _(_) | ___    _ __ ___  __ _  __| | ___ _ __
//    / __| | '_ ` _ \| '_ \| |/ _ \  | __/ _ \ \/ / __|  | |_| | |/ _ \  | '__/ _ \/ _` |/ _` |/ _ \ '__|
//    \__ \ | | | | | | |_) | |  __/  | ||  __/>  <| |_   |  _| | |  __/  | | |  __/ (_| | (_| |  __/ |
//    |___/_|_| |_| |_| .__/|_|\___|  \___\___/_/\_\\__|  |_| |_|_|\___|  |_|  \___|\__,_|\__,_|\___|_|
//                    |_| 
//
//    Because I want to know how that Path class thingy is used

//    Error codes                                     |       Future Challenges or TODO
//    1 = no path was given as argument               |       Give user a chance to enter path
//    2 = path points to a directory, not a file      |       display directory content and let user choose, then expand or shrink filePath variable according where user wants to go

//    Resources helped me
//    https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
//    https://docs.oracle.com/javase/tutorial/essential/io/pathOps.html
//    https://stackoverflow.com/questions/12780446/check-if-a-path-represents-a-file-or-a-folder

package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

public static void main(String[] args) throws IOException {

        // Check if argument was given to avoid out_of_bound error
        if ( args.length == 0 ) {                                        // Fun Fact: I tried ? operator here instead of an if statement
            System.out.print( "No path was given as argument!" );       // Learn more about ? operator [here](http://www.cafeaulait.org/course/week2/43.html)
            System.exit( 1 );
        }

        Path filePath = Paths.get(args[0]);
        //  if filePath point to a directory ...
        if ( Files.isDirectory( filePath ) ) {
            // ... exit with error code 2.
            System.out.print( "This is a directory. Not a text file!" ); System.exit(2 ) ;
        } else {
            // But if it is a file then print its content
            String fileContent = new String( Files.readAllBytes( Paths.get( filePath.toString() )));
            System.out.print( fileContent );
        }

    }
}

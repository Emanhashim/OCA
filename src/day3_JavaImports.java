import java.nio.file.Files;
import java.nio.file.Paths;

// for redundancy purpose

// import java.nio.file.*;   this import statement can work for both, file and path
// import java.nio.file.*.*;   this import statement doesnt work since wildcards only have one, and it must be at the end
// import java.nio.files.Paths.*;  this doesnt  work you only import classes not methods

public class day3_JavaImports {

    public void read(Files files){

        Paths.get("name");

    }
}

import java.util.Date;
//import java.sql.Date;   this type of import causes an ambigious cause the date class can be found in both packages
// to resolve taht issue we need to explicitly type the imports eg, lets say i need date package only from date class
// alos i needed the sql package as well so what we do is
// import java.util.Date;  and  import java.sql.*; here i can get a date from date class and all the sql packages along
// NB specific imports take precedence over explicit wildcards
public class day3NamingConflict {

    Date date;
}

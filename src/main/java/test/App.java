package test;


import org.apache.spark.rdd.RDD;
import org.apache.spark.sql.CarbonEnv;
import org.apache.carbondata.core.constants.CarbonCommonConstants;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        CarbonEnv.getCarbonTable(null, null);
        CarbonCommonConstants.CACHE_LEVEL
    }
}

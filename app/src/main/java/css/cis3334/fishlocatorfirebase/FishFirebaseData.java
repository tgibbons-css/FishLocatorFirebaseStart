package css.cis3334.fishlocatorfirebase;

import android.util.Log;

//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cssuser on 4/20/2017.
 */

public class FishFirebaseData {

    public static final String FishDataTag = "Fish Data";

    /*
    public DatabaseReference open()  {
        // Get an instance of the database and a reference to the fish data in it

    }
    */

    public void close() {

    }

    public Fish createFish( String species, String weightInOz, String dateCaught) {           //Added String rating as a parameter
        // ---- Get a new database key for the vote

        // ---- set up the fish object
        Fish newFish = new Fish();            // create a blank fish for now until the database is working
        // ---- write the vote to Firebase

        return newFish;
    }

    public Fish createFish( String species, String weightInOz, String dateCaught, String locationLatitude, String locationLongitude) {           //Added String rating as a parameter
        // ---- Get a new database key for the vote

        // ---- set up the fish object
        Fish newFish = new Fish();          // create a blank fish for now until the database is working
        // ---- write the vote to Firebase

        return newFish;
    }

    public void deleteFish(Fish fish) {

    }

    /*
    public List<Fish> getAllFish(DataSnapshot dataSnapshot) {

    }
    */

}
